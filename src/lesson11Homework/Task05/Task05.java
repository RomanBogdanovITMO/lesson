package lesson11Homework.Task05;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        for(int i = 0; i < 10; i ++){
            list.add(reader.readLine());
        }
        for (int j = 0 ; j < list.size()-1; j++){
            if(list.get(j).length()> list.get(j + 1).length()){
                System.out.println("эелемет нарушающий упорядоченность: " + list.get(j+1));
                break;
            }
        }
    }
}
