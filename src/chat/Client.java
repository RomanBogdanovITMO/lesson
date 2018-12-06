package chat;



import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class Client {
    private SocketAddress socketAddress;
    //private IOConnection connection;
    private Scanner scanner;

    public Client(SocketAddress socketAddress, Scanner scanner) {
        this.socketAddress = socketAddress;
        this.scanner = scanner;
    }

    private void start() {
        ConsolHelper.writeString("Entry your name");
        String name = ConsolHelper.readString();
        while (true) {
            ConsolHelper.writeString("Enter your message");
            String mess = ConsolHelper.readString();
            user(name,mess);
        }
    }
    private void user(String users, String command) {
        Message message = new Message(users,command);
        try (Socket socket = new Socket("localhost", 8080)) {
           // socket.connect(socketAddress);
           IOConnection conn = new IOConnection(socket);
          conn.send(message);

            //socket.connect(connection.getSocketAddress());
            Message ms = conn.receive();
            ConsolHelper.writeString("Messeg of server: " + ms.getMessText());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
    private static SocketAddress parseAddress(String address) {
        String[] strings = address.split(":");
        return new InetSocketAddress(strings[0], Integer.parseInt(strings[1]));
    }
    public static void main(String[] args) {
        String address = null;
        if (args != null && args.length > 0) {
            address = args[0];
        }
        if (address == null) {
            ConsolHelper.writeString("Entry IP address");
            address = ConsolHelper.readString();
        }
        Scanner scanner = new Scanner(System.in);
        Client client = new Client(parseAddress(address),scanner);
        client.start();
    }
}
