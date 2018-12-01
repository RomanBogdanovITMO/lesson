package lesson14Homework;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Date;

public class MetodsExternalizable implements Externalizable {
    private String user;
    private String comand;
    private Long ping;
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
        out.writeLong(ping);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.user=in.readUTF();
        this.comand = in.readUTF();
        this.ping = in.readLong();
    }
    public Date getTime(){
        Date date = new Date();
        return date;
    }

    public Long getPing() {
        return ping;
    }

    public void setPing(Long ping) {
        this.ping = ping;
    }
}
