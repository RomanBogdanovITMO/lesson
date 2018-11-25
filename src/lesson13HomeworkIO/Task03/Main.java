package lesson13HomeworkIO.Task03;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //encoder("file.txt");
        decoder("file2.txt");
    }

    public static void encoder(String file) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream("file2.txt");
            byte[] bytes = new byte[fileInputStream.available()];
            String str = "ky";
            byte[] key = str.getBytes();
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = (byte) ((fileInputStream.read()) ^ key[i % key.length]);
                fileOutputStream.write(bytes[i]);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void decoder(String file) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream("file3.txt");
            byte[] bytes = new byte[fileInputStream.available()];
            String str = "ky";
            byte[] key = str.getBytes();
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = (byte) ((fileInputStream.read()) ^ key[i % key.length]);
                fileOutputStream.write(bytes[i]);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




