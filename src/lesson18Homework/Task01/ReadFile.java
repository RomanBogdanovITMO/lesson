package lesson18Homework.Task01;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;


   public class ReadFile {
        File file;
        public HashMap<String, Integer> map;

        public ReadFile(File file) {
            this.file = file;
        }

        public synchronized List<String> listReadFile(File file) {
            List<String> listStr = null;
            try {
                listStr = Files.readAllLines(file.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
            return listStr;
        }

/*public static void main(String[] args) throws IOException {
        File file = new File("file2.txt");
        List<String> list = Files.readAllLines(file.toPath());
        String[] str = list.get(1).split(" ");
        HashMap<String,Integer> hashMap = new HashMap<>();
        int count =0;
        for (int i =0; i<str.length;i++){
            count = 0;
            for (int j = 0; j <str.length; j++){
                if(str[i].equals(str[j])){
                    count++;
                }
            }
            hashMap.put(str[i],count);
        }

       
    }*/
    }
