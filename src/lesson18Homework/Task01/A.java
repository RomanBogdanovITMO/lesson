package lesson18Homework.Task01;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A implements Runnable{
    ReadFile readFile;
    private Map<String, Integer> mapA;

    public A(ReadFile readFile, Map<String, Integer> mapA) {
        this.readFile = readFile;
        this.mapA = mapA;
    }

    public Map<String, Integer> getMapA() {
        return mapA;
    }

    public void setMapA(Map<String, Integer> mapA) {
        this.mapA = mapA;
    }

    @Override
    public void run() {
        try {
            //HashMap<String,Integer> map = new HashMap<>();
            List<String> list = readFile.getListWords();
            int count = list.size()/2;
            int countVal=0;
            for (int i = 0; i <count; i++){
                countVal = 0;
                for (int j = 0; j < count; j++){
                    if (list.get(i).equals(list.get(j))){
                        countVal++;
                    }
                }
                mapA.put(list.get(i),countVal);
            }
            for (Map.Entry entry: mapA.entrySet()){
              //  System.out.println(entry.getKey() + " " + entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

