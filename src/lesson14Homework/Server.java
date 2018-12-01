package lesson14Homework;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Server {
private int port;
public long ping;
private HashSet<String>list = new HashSet<>();
    public Server(int port) {
        this.port = port;
    }
    private  void getCommand(Socket socket){
        try(ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream())){
            Object object = objectInputStream.readObject();
            printCommand((MetodsExternalizable)object);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private  void printCommand(MetodsExternalizable metodsExternalizable){
        addUsers(metodsExternalizable);
        System.out.println("command: " + metodsExternalizable.getComand());
        if (metodsExternalizable.getComand().equals("getTime")){
            System.out.println(metodsExternalizable.getTime());
        }else if(metodsExternalizable.getComand().equals("list_users")){
            System.out.println(list);
        }else if(metodsExternalizable.getComand().equals("getPing")){
           // System.out.println(metodsExternalizable.getPing());
        }
    }

    private HashSet<String> addUsers(MetodsExternalizable metodsExternalizable){
        list.add(metodsExternalizable.getUser());
        return list;
    }
    public void start(){
        try (ServerSocket serverSocket = new ServerSocket(port)){
            System.out.println("Server started on:" + serverSocket);
            while (true){
                Socket socket = serverSocket.accept();
                getCommand(socket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int port = Integer.parseInt(args[0]);
       Server server = new Server(port);
       server.start();
    }

}
