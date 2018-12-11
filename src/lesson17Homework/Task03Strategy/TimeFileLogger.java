package lesson17Homework.Task03Strategy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TimeFileLogger implements ILogger {
    @Override
    public void write(String message) {
        File file = new File("file2.txt");
        Date date = new Date();
        Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = formatter.format(date);
        String str = message + " " + s;
        byte[] buff = str.getBytes();
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)){
            for(byte bytes: buff){
                fileOutputStream.write(bytes);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Вы успешно записали сообщение в вайл");
    }
}
