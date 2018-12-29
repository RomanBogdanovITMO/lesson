package lesson18Homework.Task02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    BlockingQueue<String> strings = new ArrayBlockingQueue<>(10, true);
    int parts = Runtime.getRuntime().availableProcessors();
    BlockingQueue<Map<String, Integer>> blockingQueue = new ArrayBlockingQueue<>(parts, true);
    private Map<String, Integer> finalMap = new HashMap<>();
    private final String EXIT = "process_end";

    public static void main(String[] args) {
        List<Thread> list = new ArrayList<>();

        Main main1 = new Main();

        for (int i = 0; i <main1.parts; i++){
            list.add(new Thread(new Process(main1)));
        }

        for (Thread thread: list){
            thread.start();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader
                (new FileInputStream("C:\\Users\\Gараж\\Desktop\\texttt.txt")))){
            String s;
            while ((s = bufferedReader.readLine()) != null){
                main1.strings.put(s);
            }
            for (int i = 0; i < main1.parts; i++){
                main1.strings.put(main1.getEXIT());
            }

            for (Thread thread: list){
                thread.join();
            }
            main1.saveToAllMap();
            main1.printTopWords();

        }catch (Exception e){
            System.out.println(e);
        }

    }
    public String getEXIT(){
        return EXIT;
    }
    public void printTopWords(){
        finalMap.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed()).limit(100).
                forEach(System.out::println);
    }
    public void saveToAllMap(){
        for (Map<String,Integer> map:blockingQueue){
            for (Map.Entry entry: map.entrySet()){
                finalMap.merge(entry.getKey().toString(),(Integer)entry.getValue(),(v1,v2)-> v1 + v2);
            }
        }
    }
}
