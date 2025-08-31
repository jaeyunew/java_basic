package java_advanced_01.day25.jsonbased_chattingV2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

// 각 클라이언트와 1:1로 통신하며 프로토콜을 처리하는 역할
public class SocketClient {

  ChatServer chatServer;
  Socket socket;
  DataInputStream dis;
  DataOutputStream dos;
  String chatName; // 닉네임

  public SocketClient(ChatServer chatServer, Socket socket) {
    try {
      this.chatServer = chatServer;
      this.socket = socket;
      this.dis = new DataInputStream(socket.getInputStream());
      this.dos = new DataOutputStream(socket.getOutputStream());
      // receive 메소드를 스레드풀의 작업 스레드에서 실행
      receive();
    } catch (IOException e) {
      // 스트림 초기화 실패 시 연결 종료
      close();
    }
  }

  // 텍스트 기반 프로토콜 수신 및 처리
  public void receive() {
    chatServer.threadPool.execute(() -> {
      try {
        // 1. 닉네임 등록 절차
        while (true) {
          String initialMessage = dis.readUTF();
          if (initialMessage.startsWith("NICK ")) {
            String potentialName = initialMessage.substring(5).trim();
            // 닉네임 유효성 검사 (공백, 중복)
            if (potentialName.isEmpty() || potentialName.contains(" ")) {
              send("ERR 닉네임은 공백을 포함할 수 없으며 비어있을 수 없습니다.");
              continue;
            }
            if (chatServer.isNicknameDuplicate(potentialName)) {
              send("ERR 이미 사용 중인 닉네임입니다.");
              continue;
            }
            // 닉네임 등록 성공
            this.chatName = potentialName;
            send("OK 닉네임이 등록되었습니다. 이제부터 채팅이 가능합니다.");
            chatServer.addSocketClient(this);
            chatServer.broadcast(this.chatName + "님이 입장하셨습니다.");
            break; // 닉네임 등록 완료, 메인 채팅 루프로 이동
          } else {
            send("ERR 먼저 'NICK <이름>' 형식으로 닉네임을 등록해야 합니다.");
          }
        }

        // 2. 메인 채팅 및 명령어 처리 루프
        while (true) {
          String message = dis.readUTF();
          if ("/quit".equalsIgnoreCase(message)) {
            break; // 루프를 탈출하여 종료 절차 진행
          } else if ("/who".equalsIgnoreCase(message)) {
            send(chatServer.getOnlineUsers()); // 현재 접속자 목록을 본인에게만 전송
          } else {
            // 일반 채팅 메시지는 모든 사용자에게 브로드캐스트
            chatServer.broadcast("[" + this.chatName + "] " + message);
          }
        }
      } catch (IOException e) {
        // 클라이언트 비정상 종료 (예: 강제 종료)
      } finally {
        // 종료 절차 (정상/비정상 종료 모두 처리)
        if (this.chatName != null) {
          chatServer.broadcast(this.chatName + "님이 퇴장하셨습니다.");
          chatServer.removeSocketClient(this);
        }
        close();
      }
    });
  }

  // 메소드: 클라이언트로 메시지 보내기
  public void send(String message) {
    try {
      dos.writeUTF(message);
      dos.flush();
    } catch (IOException e) {
      // 메시지 전송 실패 시 해당 클라이언트는 문제가 있는 것으로 간주
    }
  }

  // 메소드: 연결 종료
  public void close() {
    try {
      if (socket != null && !socket.isClosed()) {
        socket.close();
      }
    } catch (IOException e) {
    }
  }
}