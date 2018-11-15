package lesson11Homework.Task07;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        int repet = 0;
        for(int i = 0; i <9; i++){
            map.put("Фамилия" + i,"Роман"+i);
        }
        map.put("Фамилия9","Роман0");
        System.out.println(map);
        for(Map.Entry<String,String> entry: map.entrySet()){
            if(entry.getValue().equals("Роман0")){
                repet++;
            }
        }
        System.out.println(repet);
    }
}
