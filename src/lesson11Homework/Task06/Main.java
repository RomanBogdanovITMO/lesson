package lesson11Homework.Task06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++){
            list.add(reader.readLine());
        }
        System.out.println(list);
        for(int i = 0; i < m; i++){
            list.add(list.get(0));
            list.remove(0);
        }
        System.out.println(list);
    }

}
