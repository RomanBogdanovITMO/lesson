package lesson11Homework.Task08;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,Date> map = new HashMap<String, Date>();
        map.put("Василий", new Date("JUNE 1 1980"));
        map.put("Иван", new Date("JULY 10 1981"));
        map.put("Петр", new Date("APRIL 21 1978"));
        map.put("Никита", new Date("MARCH 12 1992"));
        map.put("Антон", new Date("AUGUST 10 1982"));
        map.put("Вячеслав", new Date("JANUARY 1 1980"));
        map.put("Николай", new Date("JANUARY 7 1996"));
        map.put("Артем", new Date("JUNE 25 1988"));
        map.put("Андрей", new Date("MARCH 11 2000"));

        System.out.println(map);
        System.out.println(map.size());

        for(Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator(); iterator.hasNext();){
            Map.Entry<String,Date> pair = iterator.next();
            Date date = pair.getValue();
            int monf = date.getMonth();
            if(monf > 4 && monf  < 8){
                iterator.remove();
            }
        }
        System.out.println("");
        System.out.println(map);
        System.out.println(map.size());
    }
}
