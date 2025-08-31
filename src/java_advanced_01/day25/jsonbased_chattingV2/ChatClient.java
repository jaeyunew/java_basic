package java_advanced_01.day25.jsonbased_chattingV2;

import java.io.*;
import java.net.Socket;
import java.net.ConnectException;

public class ChatClient {

  Socket socket;
  DataInputStream dis;
  DataOutputStream dos;
  String chatName;

  // 메소드: 서버 연결
  public void connect() throws IOException {
    // 요구사항에 명시된 기본 포트 5000으로 변경
    socket = new Socket("localhost", 5000);
    // UTF-8 통신을 위한 스트림 설정
    dis = new DataInputStream(socket.getInputStream());
    dos = new DataOutputStream(socket.getOutputStream());
    System.out.println("[클라이언트] 서버에 연결됨");
  }

  // 메소드: 서버로부터 메시지 받기 (수정 없음, 단순 출력 역할)
  public void receive() {
    Thread thread = new Thread(() -> {
      try {
        while (true) {
          String message = dis.readUTF();
          System.out.println(message);
        }
      } catch (IOException e) {
        System.out.println("[클라이언트] 서버 연결이 끊어졌습니다. 프로그램을 종료합니다.");
      }
    });
    thread.start();
  }

  // 메소드: 서버로 메시지 보내기
  public void send(String message) throws IOException {
    dos.writeUTF(message);
    dos.flush();
  }

  // 메소드: 서버 연결 종료
  public void unconnect() throws IOException {
    if (socket != null && !socket.isClosed()) {
      socket.close();
    }
  }

  // 메인 메소드
  public static void main(String[] args) {
    ChatClient chatClient = new ChatClient();
    try {
      chatClient.connect();

      // 한글 입력을 위해 UTF-8 인코딩 지정
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));

      System.out.print("사용할 닉네임을 입력하세요: ");
      String nickname = br.readLine();
      // 'NICK <이름>' 프로토콜에 맞춰 닉네임 전송
      chatClient.send("NICK " + nickname);

      // 서버로부터 메시지를 수신할 스레드 시작
      chatClient.receive();

      System.out.println("--------------------------------------------------");
      System.out.println("메시지를 입력하세요. (/who: 접속자, /quit: 종료)");
      System.out.println("--------------------------------------------------");

      while (true) {
        String message = br.readLine();
        if (message == null) { // Ctrl+D 입력 시
          break;
        }

        chatClient.send(message);

        if ("/quit".equalsIgnoreCase(message)) {
          break;
        }
      }
    } catch (ConnectException e) {
      System.out.println("[클라이언트] 서버에 연결할 수 없습니다. 서버가 실행 중인지 확인하세요.");
    } catch (IOException e) {
      System.out.println("[클라이언트] 입출력 오류: " + e.getMessage());
    } finally {
      try {
        chatClient.unconnect();
      } catch (IOException e) {
        // 종료 시 발생하는 예외는 무시
      }
    }
  }
}