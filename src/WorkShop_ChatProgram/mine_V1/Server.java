package WorkShop_ChatProgram.mine_V1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Server {

  private static final int PORT = 5000;
  private static final ExecutorService POOL = Executors.newCachedThreadPool();

  public static void main(String[] args) {

    System.out.println("[Server] Starting on port " + PORT);

    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
      System.out.println("\n[Server] Shutting down...");
      POOL.shutdownNow();
    }));

    try (ServerSocket serverSocket = new ServerSocket(PORT)) {
      while (true) {
        Socket socket = serverSocket.accept();

      }
    } catch (IOException e) {
      System.out.println("[Server] Error: " + e.getMessage());
    }
  }


}
