package lesson14Homework;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class PrintClientt {
    private SocketAddress socketAddress;
    private Scanner scanner;
    public Long ping;
    public PrintClientt(SocketAddress address, Scanner scanner) {
        this.socketAddress = address;
        this.scanner = scanner;
    }
    private void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entry your name");
        String user = scanner.nextLine();
        while (true) {
            System.out.println("Entry your comand");
            user(user, scanner.nextLine());
        }

    }
    private void user(String users, String command) {
        Long start = System.currentTimeMillis();
        MetodsExternalizable user = new MetodsExternalizable(users, command);
        try (Socket socket = new Socket()) {
            socket.connect(socketAddress);
            try (OutputStream out = socket.getOutputStream(); ObjectOutputStream objectOutputStream = new ObjectOutputStream(out)) {
                objectOutputStream.writeObject(user);
                objectOutputStream.flush();
            }
        } catch (Exception e) {
            System.out.println(e);
            Long finish = System.currentTimeMillis()-start;
            user.setPing(finish);
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
            Scanner scanner = new Scanner(System.in);

            if (address == null) {
                System.out.println("Entry IP address");
                address = scanner.nextLine();
            }
            PrintClientt user = new PrintClientt(parseAddress(address), scanner);
            user.start();
        }
    }

