package lesson14Homework;


import lesson.prinApp.MessaGE;
import lesson.prinApp.PrintServer;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
private int port;

    public Server(int port) {
        this.port = port;
    }
    private  void getMessage(Socket socket){
        try(ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream())){
            Object object = objectInputStream.readObject();
            printMessage((MetodsExternalizable)object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private  void printMessage(MetodsExternalizable metodsExternalizable){
        System.out.println("comand: " + metodsExternalizable.getComand());
    }
    public void start(){
        try (ServerSocket serverSocket = new ServerSocket(port)){
            System.out.println("Server started on:" + serverSocket);
            while (true){
                Socket socket = serverSocket.accept();
                getMessage(socket);
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
