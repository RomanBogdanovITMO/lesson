package lesson16omework.Task01;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CryptoInputStream extends FilterInputStream {
    private String password;
    protected CryptoInputStream(InputStream in,String key ) {
        super(in);
        this.password = key;
    }

    @Override
    public int available() throws IOException {
        return super.available();
    }

    @Override
    public int read() throws IOException {
        int res = super.read();
        int newByte = 0;
        byte bytes;
        int key = password.length();
        for(int i = 0; i< 1; i++){
            bytes =(byte) (res ^ (key +2));
            newByte = (int)bytes;
        }
        return newByte;
    }
}
