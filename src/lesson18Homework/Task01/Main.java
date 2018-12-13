package lesson18Homework.Task01;


import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("file2.txt");
        ReadFile readFile = new ReadFile(file);
        System.out.println(readFile.listReadFile(file));
        int count = Runtime.getRuntime().availableProcessors();
        for (int i = 0; i<count; i++){
            new Thread(new A()).start();
        }


    }
}
