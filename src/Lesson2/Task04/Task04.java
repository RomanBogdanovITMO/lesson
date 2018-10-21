package Lesson2.Task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nuber = Integer.parseInt(reader.readLine());
        if (nuber % 2 == 0){
            System.out.println(nuber + " Число составное");
        }else {
            System.out.println(nuber + " простое число");
        }
    }
}
