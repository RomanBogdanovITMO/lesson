package lesson14Homework;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class PrintClient {
    private SocketAddress socketAddress;
    private Scanner scanner;

    public PrintClient(SocketAddress address, Scanner scanner){
        this.socketAddress = address;
        this.scanner = scanner;
    }


    private void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entry your name");
        String user = scanner.nextLine();
        while (true){
            System.out.println("Entry your comand");
            user(user,scanner.nextLine());
        }

    }
    private void user(String users, String command){
        MetodsExternalizable user = new MetodsExternalizable(users,command);
        try (Socket socket = new Socket()){
            socket.connect(socketAddress);
            try (OutputStream out = socket.getOutputStream(); ObjectOutputStream objectOutputStream = new ObjectOutputStream(out)){
                objectOutputStream.writeObject(user);
                objectOutputStream.flush();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    private static SocketAddress parseAddress(String address){
        String[] strings = address.split(":");
        return new InetSocketAddress(strings[0],Integer.parseInt(strings[1]));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String addres = null;
        if(addres==null){
            System.out.println("Entry IP address");
            addres = scanner.nextLine();
        }
        PrintClient user = new PrintClient(parseAddress(addres),scanner);
        user.start();
    }
}
