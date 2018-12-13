package lesson18Homework.Task01;

import java.util.List;

public class A implements Runnable{
    ReadFile readFile;
    @Override
    public void run() {
        int count = 0;
        List<String> list1 = readFile.listReadFile(readFile.file);
        for (int i = 0; i < list1.size(); i++) {
            String[] str = list1.get(i).split(" ");
            for (int j = 0; j < str.length; j++) {
                count = 0;
                for (int k = 0; k < str.length; k++) {
                    if (str[j].equals(str[k])) {
                        count++;
                    }
                }
                readFile.map.put(str[j], count);
            }
        }
    }
    }

