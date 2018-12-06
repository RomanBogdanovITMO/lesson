package lesson16omework.Task01;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class CryptoOutputStream extends FilterOutputStream {
    private String password;
    public CryptoOutputStream(OutputStream out, String Key) {
        super(out);
        this.password = Key;
    }

    @Override
    public void write(byte[] b) throws IOException {
        int key = password.length();
        for(int i = 0; i < 1; i++){
            byte newByte = (byte) (b[i] ^ (key + 2));
        }
    }
}
