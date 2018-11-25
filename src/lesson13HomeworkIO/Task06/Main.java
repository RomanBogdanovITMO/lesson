package lesson13HomeworkIO.Task06;


import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("file.txt");
             FileOutputStream outputStream = new FileOutputStream("file2.txt");
             FileOutputStream outputStream1 = new FileOutputStream("file3.txt")) {

            while (inputStream.available() > 0) {
                if (inputStream.read() % 2 == 0) {
                    byte[] out1 = new byte[inputStream.available() / 2];
                    byte[] out2 = new byte[inputStream.available() / 2];
                    int count1 = inputStream.read(out1);
                    int count2 = inputStream.read(out2);
                    outputStream.write(out1, 0, count1);
                    outputStream1.write(out2, 0, count2);
                } else {
                    byte[] out1 = new byte[inputStream.available() / 2 + 1];
                    byte[] out2 = new byte[inputStream.available() / 2];
                    int count1 = inputStream.read(out1);
                    int count2 = inputStream.read(out2);
                    outputStream.write(out1, 0, count1);
                    outputStream1.write(out2, 0, count2);
                }
            }
            inputStream.close();
            outputStream.close();
            outputStream1.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
