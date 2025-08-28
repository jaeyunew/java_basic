package java_advanced_01.day24.practice;

import java.io.IOException;
import java.net.Socket;

public class Client {


  public static void main(String[] args) {
    try {
      Socket socket = new Socket("localhost", 5000);
      System.out.println("서버접속성공");
      socket.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}
