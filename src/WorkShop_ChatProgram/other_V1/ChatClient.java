package WorkShop_ChatProgram.other_V1;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

/**
 * ChatServer에 접속하는 TCP 채팅 클라이언트입니다. 항상 고정된 기본 주소(127.0.0.1:5000)를 사용합니다.
 */
public class ChatClient {

  // ★★★ 기본 접속 정보를 고정값으로 설정 ★★★
  private static final String HOST = "127.0.0.1";
  private static final int PORT = 5000;

  public static void main(String[] args) {

    try (Socket socket = new Socket(HOST, PORT)) {
      System.out.println("[Client] Connected to chat server at " + HOST + ":" + PORT);

      PrintWriter out = new PrintWriter(
          new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);
      BufferedReader keyboard = new BufferedReader(
          new InputStreamReader(System.in, StandardCharsets.UTF_8));

      // 서버로부터 메시지를 수신하는 별도의 스레드를 시작
      Thread receiverThread = new Thread(new ServerListener(socket));
      receiverThread.start();

      // 닉네임 등록 과정
      // 서버의 안내 메시지를 받은 후 사용자가 닉네임을 입력합니다.
      String nickname = keyboard.readLine();
      if (nickname == null || nickname.trim().isEmpty()) {
        System.out.println("[Client] Nickname cannot be empty. Exiting.");
        return;
      }
      // 서버는 일반 메시지와 닉네임을 구분하지 않으므로, 그냥 닉네임을 보냅니다.
      out.println(nickname);

      // 메인 채팅 루프
      String userInput;
      while ((userInput = keyboard.readLine()) != null) {
        out.println(userInput);
        // /quit 입력 시 클라이언트 종료
        if ("/quit".equalsIgnoreCase(userInput.trim())) {
          break;
        }
      }

    } catch (UnknownHostException e) {
      System.err.println("[Client] Error: Unknown host " + HOST);
    } catch (IOException e) {
      System.err.println("[Client] Error: Could not connect to server. Is the server running?");
    } finally {
      System.out.println("[Client] Disconnected. Bye.");
    }
  }

  /**
   * 서버로부터 오는 메시지를 계속 수신하여 콘솔에 출력하는 역할을 하는 Runnable 클래스입니다.
   */
  private static class ServerListener implements Runnable {

    private final Socket socket;
    private BufferedReader in;

    public ServerListener(Socket socket) {
      this.socket = socket;
      try {
        this.in = new BufferedReader(
            new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
      } catch (IOException e) {
        System.err.println("[Client] Error setting up input stream: " + e.getMessage());
      }
    }

    @Override
    public void run() {
      try {
        String serverMessage;
        while ((serverMessage = in.readLine()) != null) {
          // 서버 종료 메시지 수신 시 클라이언트 종료
          if (serverMessage.startsWith("SERVER_SHUTDOWN")) {
            System.out.println("[Client] Server is shutting down. Disconnecting.");
            break;
          }
          System.out.println(serverMessage);
        }
      } catch (SocketException e) {
        // 메인 스레드에서 소켓을 닫았을 때 발생하는 정상적인 예외
        System.out.println("[Client] Connection closed.");
      } catch (IOException e) {
        System.err.println("[Client] Error receiving message from server: " + e.getMessage());
      } finally {
        try {
          // 수신 스레드가 종료될 때 소켓을 닫아 메인 스레드도 종료되도록 유도
          if (socket != null && !socket.isClosed()) {
            socket.close();
          }
        } catch (IOException e) { /* 무시 */ }
      }
    }
  }
}