package lesson13HomeworkIO.Task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int count = 0;
        try (FileInputStream inputStream = new FileInputStream(reader.readLine())){
            while (inputStream.available() > 0){
                list.add(inputStream.read());
            }
            reader.close();
        }catch (IOException e){
            System.out.println(e);
        }
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == 44){
                count++;
            }
        }
        System.out.println(count);
    }
}
