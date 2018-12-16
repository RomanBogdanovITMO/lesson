package lesson18Homework.Task01;
import java.io.File;
import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
       File file = new File("file2.txt");

       ReadFile readFile = new ReadFile(file, new HashMap<>());
       A  a = new A(readFile,new HashMap<>());
       B b = new B(readFile,new HashMap<>());

       Thread thread1 = new Thread(a);
       Thread thread2 = new Thread(b);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

      Map<String, Integer> maps = new HashMap<>();
      maps.putAll(a.getMapA());
      maps.putAll(b.getMapB());

      Map<String, Integer> mapwords = new HashMap<>();
        for (Map.Entry<String, Integer> entry : maps.entrySet()) {
            String key = entry.getKey();
            Integer current = mapwords.get(key);
            mapwords.put(key, current == null ? entry.getValue() : entry.getValue() + current);
        }

        maps.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);

    }
}
