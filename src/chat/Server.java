package chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private int port;
    private IOConnection connection;

    public Server(int port) {
        this.port = port;
    }

    public void start(){
        try (ServerSocket serverSocket = new ServerSocket(port)){
            ConsolHelper.writeString("Server started on: " + serverSocket);
            while (true) {
                Socket socket = serverSocket.accept();
                connection = new IOConnection(socket);
                Message message = connection.receive();
                ConsolHelper.writeString("messeg: " + message.getMessText());
                //socket.connect(connection.getSocketAddress());
                connection.send(message);
            }
                } catch (IOException | ClassNotFoundException e) {
                    System.out.println(e);
                }
            }

    public static void main(String[] args) {
     //   int port = Integer.parseInt(args[0]);
        Server server = new Server(8080);
        server.start();
    }
}
