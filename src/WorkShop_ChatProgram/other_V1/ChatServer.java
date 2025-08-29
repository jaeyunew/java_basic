package WorkShop_ChatProgram.other_V1;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

/**
 * 다중 클라이언트의 연결을 받아 채팅 메시지를 중계하는 TCP 채팅 서버입니다. 각 클라이언트는 고유한 닉네임을 가지며, 입장/퇴장/채팅 내용이 모든 클라이언트에게
 * 브로드캐스트됩니다.
 */
public class ChatServer {

  // 서버 포트 번호
  private static final int DEFAULT_PORT = 5000;
  // 접속한 모든 클라이언트를 관리하는 맵. Key: 닉네임, Value: ClientHandler 인스턴스
  // 여러 스레드가 동시에 접근하므로 thread-safe한 ConcurrentHashMap을 사용합니다.
  private static final Map<String, ClientHandler> clients = new ConcurrentHashMap<>();
  // 클라이언트 연결을 처리할 스레드 풀
  private static final ExecutorService pool = Executors.newCachedThreadPool();

  public static void main(String[] args) {
    int port = args.length > 0 ? Integer.parseInt(args[0]) : DEFAULT_PORT;
    System.out.println("[Server] Chat server starting on port " + port);

    // 프로그램 종료 시(Ctrl+C) 스레드 풀과 자원을 정리하는 Shutdown Hook 등록
    addShutdownHook();

    try (ServerSocket serverSocket = new ServerSocket(port)) {
      while (true) {
        // 클라이언트의 연결을 기다림 (Blocking)
        Socket socket = serverSocket.accept();
        // 연결된 클라이언트를 처리할 ClientHandler를 생성하고 스레드 풀에 작업을 제출
        pool.submit(new ClientHandler(socket));
      }
    } catch (IOException e) {
      System.err.println("[Server] Error: Could not start server. " + e.getMessage());
      // 서버 소켓 생성 실패 시 스레드 풀을 종료하고 프로그램을 끝냅니다.
      pool.shutdownNow();
    }
  }

  /**
   * 서버 종료 시 자원을 안전하게 해제하는 Shutdown Hook을 추가합니다.
   */
  private static void addShutdownHook() {
    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
      System.out.println("\n[Server] Shutting down...");
      try {
        // 모든 클라이언트에게 서버 종료를 알림
        broadcast("SERVER_SHUTDOWN", "Server is shutting down. Disconnecting.");
        // 스레드 풀 종료
        pool.shutdownNow();
        // 모든 클라이언트 소켓 닫기
        for (ClientHandler client : clients.values()) {
          client.closeConnection();
        }
      } catch (Exception e) {
        // Shutdown 중 발생한 예외는 무시
      }
      System.out.println("[Server] Shutdown complete.");
    }));
  }

  /**
   * 특정 사용자를 제외하고 모든 클라이언트에게 메시지를 브로드캐스트합니다.
   *
   * @param senderNickname 메시지를 보낸 사람의 닉네임 (이 닉네임의 클라이언트는 제외)
   * @param message        전송할 메시지
   */
  private static void broadcast(String senderNickname, String message) {
    clients.values().stream()
        .filter(client -> !client.getNickname().equals(senderNickname))
        .forEach(client -> client.sendMessage(message));
  }

  /**
   * 모든 클라이언트에게 메시지를 브로드캐스트합니다.
   *
   * @param message 전송할 메시지
   */
  private static void broadcastAll(String message) {
    clients.values().forEach(client -> client.sendMessage(message));
  }


  /**
   * 개별 클라이언트와의 통신을 담당하는 핸들러 클래스. Runnable을 구현하여 스레드에서 실행됩니다.
   */
  private static class ClientHandler implements Runnable {

    private final Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    private String nickname;

    public ClientHandler(Socket socket) {
      this.socket = socket;
    }

    public String getNickname() {
      return nickname;
    }

    @Override
    public void run() {
      try {
        // 입출력 스트림 초기화
        in = new BufferedReader(
            new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
        out = new PrintWriter(
            new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);

        // 1. 닉네임 등록 절차
        if (!registerNickname()) {
          return; // 닉네임 등록 실패 시 연결 종료
        }

        // 2. 메인 채팅 루프
        handleChat();

      } catch (IOException e) {
        System.err.println(
            "[Server] I/O Error for " + (nickname != null ? nickname : "a client") + ": "
                + e.getMessage());
      } finally {
        // 3. 연결 종료 처리
        cleanup();
      }
    }

    /**
     * 클라이언트로부터 `NICK <nickname>` 명령을 받아 닉네임을 등록합니다. 성공 시 true, 실패 시 false를 반환합니다.
     */
    private boolean registerNickname() throws IOException {
      sendMessage("OK Welcome to the chat server. Please send 'NICK <your_name>'.");
      String nickCommand = in.readLine();

      if (nickCommand == null) {
        sendMessage("ERR Invalid command. Closing connection.");
        return false;
      }

      String potentialNickname = nickCommand.trim();
      // 닉네임 유효성 검사 (공백, 중복)
      if (potentialNickname.isEmpty() || potentialNickname.contains(" ") || clients.containsKey(
          potentialNickname)) {
        sendMessage("ERR Nickname is invalid or already taken. Closing connection.");
        return false;
      }

      this.nickname = potentialNickname;
      // 등록 성공
      sendMessage("OK Nickname '" + nickname + "' accepted.");
      System.out.println(
          "[Server] " + nickname + " connected from " + socket.getRemoteSocketAddress());
      broadcastAll(nickname + " joined");
      return true;
    }

    /**
     * 클라이언트로부터 메시지를 받아 처리하는 메인 루프.
     */
    private void handleChat() throws IOException {
      String message;
      while ((message = in.readLine()) != null) {
        System.out.println("[Server] Message from " + nickname + ": " + message);

        if (message.startsWith("/")) {
          handleCommand(message);
        } else {
          broadcastAll("[" + nickname + "] " + message);
        }
      }
    }

    /**
     * 클라이언트가 보낸 명령어(e.g., /who, /quit)를 처리합니다.
     *
     * @param command 받은 명령어 문자열
     */
    private void handleCommand(String command) {
      if ("/who".equalsIgnoreCase(command)) {
        String userList = clients.keySet().stream().sorted().collect(Collectors.joining(", "));
        sendMessage("USERS " + userList);
      } else if ("/quit".equalsIgnoreCase(command)) {
        // 클라이언트가 정상 종료를 원하므로 루프를 탈출하여 finally 블록으로 이동시킴
        try {
          socket.close(); // 소켓을 닫아 readLine()이 null을 반환하게 만듦
        } catch (IOException e) { /* 무시 */ }
      } else {
        sendMessage("ERR Unknown command: " + command);
      }
    }

    /**
     * 연결 종료 시 호출되어 자원을 정리하고 다른 사용자에게 퇴장을 알립니다.
     */
    private void cleanup() {
      if (nickname != null) {
        clients.remove(nickname);
        System.out.println("[Server] " + nickname + " disconnected.");
        broadcastAll(nickname + " left");
      }
      closeConnection();
    }

    /**
     * 이 클라이언트에게 메시지를 전송합니다.
     *
     * @param message 보낼 메시지
     */
    public void sendMessage(String message) {
      if (out != null) {
        out.println(message);
      }
    }

    /**
     * 이 클라이언트의 소켓 연결을 닫습니다.
     */
    public void closeConnection() {
      try {
        if (socket != null && !socket.isClosed()) {
          socket.close();
        }
      } catch (IOException e) {
        // 소켓 닫기 실패는 무시
      }
    }
  }
}