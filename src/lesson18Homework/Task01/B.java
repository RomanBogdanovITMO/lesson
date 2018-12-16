package lesson18Homework.Task01;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class B implements Runnable {
    ReadFile readFile;
    private Map<String, Integer> mapB;

    public B(ReadFile readFile, Map<String, Integer> mapB) {
        this.readFile = readFile;
        this.mapB = mapB;
    }

    public Map<String, Integer> getMapB() {
        return mapB;
    }

    public void setMapB(Map<String, Integer> mapB) {
        this.mapB = mapB;
    }

    @Override
    public void run() {
        try {
            //HashMap<String,Integer> map = new HashMap<>();
            List<String> list = readFile.getListWords();
            int count = list.size()/2;
            int countVal=0;
            for (int i = count; i <list.size(); i++){
                countVal = 0;
                for (int j = 0; j < count; j++){
                    if (list.get(i).equals(list.get(j))){
                        countVal++;
                    }
                }
                mapB.put(list.get(i),countVal);
            }
            for (Map.Entry entry: mapB.entrySet()){
                //System.out.println(entry.getKey() + " " + entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
