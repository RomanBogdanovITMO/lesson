package lesson11Homework.Task03;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DoubleString {
    static List<String> list;
    static List<String> list2;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        list = new ArrayList<>();
        list2 = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            list.add(reader.readLine());
        }
        doubleValue();
        printList();
    }
    public static List<String>  doubleValue(){
        for(int i = 0; i < list.size(); i ++){
            String s = list.get(i);
            list2.add(i, s + s);
        }
        return list2;
    }
    public  static void printList(){
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }
}

