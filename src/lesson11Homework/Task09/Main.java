package lesson11Homework.Task09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(clearMap());
        remove(clearMap());
    }
    public static Map<String,Integer> clearMap(){
        Map<String, Integer> map = new HashMap<>();
        map.put("Name1", 100);
        map.put("Name2", 200);
        map.put("Name3", 300);
        map.put("Name4", 400);
        map.put("Name5", 500);
        map.put("Name6", 600);
        map.put("Name7", 700);
        map.put("Name8", 800);
        map.put("Name9", 900);
        map.put("Name10", 1000);
        return map;
    }
    public static void remove(Map<String,Integer> map) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int salary = Integer.parseInt(reader.readLine());
        map.entrySet().removeIf(pair -> pair.getValue() < salary);
        System.out.println(map);
    }
}
