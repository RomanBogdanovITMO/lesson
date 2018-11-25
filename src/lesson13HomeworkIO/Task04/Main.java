package lesson13HomeworkIO.Task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr = new ArrayList<>();
        try {
            FileInputStream inputStream = new FileInputStream(reader.readLine());
            while (inputStream.available()>0){
                arr.add(inputStream.read());
            }
            reader.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(arr);
        System.out.println(arr);
        for(int i = 0;i < arr.size()-1; i++){
            if(arr.get(i)==arr.get(i+1)){
                arr.remove(i);
                i--;
            }
        }
        System.out.println(" ");
        System.out.println(arr);
    }
}
