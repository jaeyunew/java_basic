package java_advanced_01.day25.jsonbased_chattingV2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class ChatServer {

  // 필드
  ServerSocket serverSocket;
  // 요구사항에 명시된 기본 포트 5000으로 변경
  private static final int PORT = 5000;
  ExecutorService threadPool = Executors.newFixedThreadPool(100);
  // Key를 닉네임으로 사용하여 중복 체크 및 관리를 용이하게 함
  Map<String, SocketClient> chatRoom = new ConcurrentHashMap<>();

  // 메소드: 서버 시작
  public void start() throws IOException {
    serverSocket = new ServerSocket(PORT);
    System.out.println("[서버] 시작됨 (Port: " + PORT + ")");

    // Ctrl+C (프로그램 종료 시그널)를 받았을 때 종료하기 위한 Shutdown Hook 추가
    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
      System.out.println("\n[서버] 종료 절차를 시작합니다...");
      stop();
    }));

    Thread thread = new Thread(() -> {
      try {
        while (!serverSocket.isClosed()) {
          Socket socket = serverSocket.accept();
          // SocketClient는 연결 직후 생성되지만, 닉네임이 등록되어야 chatRoom에 추가됨
          new SocketClient(this, socket);
        }
      } catch (IOException e) {
        // 서버 소켓이 닫힐 때 발생하는 예외는 정상 종료 과정이므로 무시
        if (!serverSocket.isClosed()) {
          System.out.println("[서버] 네트워크 오류: " + e.getMessage());
        }
      }
    });
    thread.start();
  }

  // 메소드: 클라이언트 입장 처리 (닉네임 등록 성공 시 호출)
  public void addSocketClient(SocketClient socketClient) {
    chatRoom.put(socketClient.chatName, socketClient);
    System.out.println("입장: " + socketClient.chatName);
    System.out.println("현재 채팅자 수: " + chatRoom.size() + "\n");
  }

  // 메소드: 클라이언트 퇴장 처리
  public void removeSocketClient(SocketClient socketClient) {
    if (socketClient.chatName != null) {
      chatRoom.remove(socketClient.chatName);
      System.out.println("나감: " + socketClient.chatName);
      System.out.println("현재 채팅자 수: " + chatRoom.size() + "\n");
    }
  }

  // [기능 추가] 닉네임 중복 체크
  public synchronized boolean isNicknameDuplicate(String chatName) {
    return chatRoom.containsKey(chatName);
  }

  // [기능 추가] /who 명령어 처리를 위한 현재 접속자 목록 반환
  public String getOnlineUsers() {
    if (chatRoom.isEmpty()) {
      return "현재 접속자가 없습니다.";
    }
    String userList = chatRoom.keySet().stream().sorted().collect(Collectors.joining(", "));
    return "현재 접속자: " + userList;
  }

  // [기능 수정] 모든 클라이언트에게 메시지를 보내는 기능 (브로드캐스트)
  public void broadcast(String message) {
    Collection<SocketClient> socketClients = chatRoom.values();
    for (SocketClient sc : socketClients) {
      sc.send(message);
    }
  }

  // 메소드: 서버 종료
  public void stop() {
    try {
      if (serverSocket != null && !serverSocket.isClosed()) {
        serverSocket.close();
      }
      if (threadPool != null && !threadPool.isShutdown()) {
        threadPool.shutdownNow();
      }
      // 모든 클라이언트에게 서버 종료 알림
      broadcast("서버가 종료됩니다. 채팅을 종료합니다.");
      chatRoom.values().forEach(SocketClient::close);
      System.out.println("[서버] 모든 자원이 정리되었습니다. 종료됨.");
    } catch (IOException e) {
      // 종료 과정에서 발생하는 예외는 무시
    }
  }

  // 메소드: 메인
  public static void main(String[] args) {
    try {
      ChatServer chatServer = new ChatServer();
      chatServer.start();

      System.out.println("----------------------------------------------------");
      System.out.println("서버를 종료하려면 q를 입력하고 Enter를 누르세요.");
      System.out.println("----------------------------------------------------");

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      while (true) {
        if ("q".equalsIgnoreCase(br.readLine())) {
          break;
        }
      }
      chatServer.stop();
    } catch (IOException e) {
      System.out.println("[서버] 시작 중 오류 발생: " + e.getMessage());
    }
  }
}