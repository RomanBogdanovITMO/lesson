package lesson17Homework.Task03Strategy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileLogger implements ILogger {
    @Override
    public void write(String message) {
        byte[] buff = message.getBytes();
        File file = new File("file1.txt");
        try (FileOutputStream outputStream = new FileOutputStream(file)){
            for(byte bytes: buff){
                outputStream.write(bytes);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Вы успешно записали сообщение в вайл");
    }
}
