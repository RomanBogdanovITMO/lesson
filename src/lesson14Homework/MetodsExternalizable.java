package lesson14Homework;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Date;
import java.util.Scanner;

public class MetodsExternalizable implements Externalizable {
    private String user;
    private String comand;
    public long ping;
    public MetodsExternalizable(){

    }

    public MetodsExternalizable(String user, String comand) {
        this.user = user;
        this.comand = comand;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getComand() {
        return comand;
    }

    public void setComand(String comand) {
        this.comand = comand;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(user);
        out.writeUTF(comand);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.user=in.readUTF();
        this.comand = in.readUTF();
    }
    public Date getTime(){
        Date date = new Date();
        return date;
    }
    public long getPing(PrintClientt printClientt){
        this.ping = printClientt.ping;
        return ping;
    }


}
