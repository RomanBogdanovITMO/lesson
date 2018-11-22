package lesson13HomeworkIO.Task01;

import java.io.*;


public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream = null;
        int counBytes = 0;
        try {
            inputStream = new FileInputStream(reader.readLine());
            byte[]bytes = new byte[inputStream.available()];
            for(int i = 0; i<bytes.length; i++){
                counBytes++;
            }
            System.out.println(counBytes);
        } catch (IOException e) {
            System.out.println(e);
        }


    }
}
