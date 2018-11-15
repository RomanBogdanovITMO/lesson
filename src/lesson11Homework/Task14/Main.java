package lesson11Homework.Task14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        try {
            str = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String, String> map = new HashMap<>();
        map.put("Никифоов", "Москва");
        map.put("Богданов", "Москва");
        map.put("Николаев", "Новгород");
        map.put("Кирилов", "Новгород");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(str)) {
                System.out.println(entry.getKey());
            }
        }
    }
}