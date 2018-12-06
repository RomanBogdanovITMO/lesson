package chat;



import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketAddress;

public class IOConnection {
    Socket socket;
    ObjectOutputStream out;
    ObjectInputStream in;

    public IOConnection(Socket socket) {
        this.socket = socket;
        try {
            this.out = new ObjectOutputStream(socket.getOutputStream());
            this.in = new ObjectInputStream(socket.getInputStream());
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void send(Message message){
        try {
            out.writeObject(message);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public Message receive() throws IOException, ClassNotFoundException {
        return (Message) in.readObject();
    }
    public SocketAddress getSocketAddress(){
        return socket.getRemoteSocketAddress();
    }

}
