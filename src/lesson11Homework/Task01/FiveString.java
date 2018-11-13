package lesson11Homework.Task01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FiveString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        System.out.println("введите 5 строк:");
        for(int i = 0; i < 5; i++){
            list.add(reader.readLine());
        }
        System.out.println("Выхотите использовать метод shortString: да,не?");
        if((reader.readLine()).equals("да")){
            for(String s: list){
                if(s.length() < min){
                    min = s.length();
                }
            }
            for (String s1: list){
                if(s1.length()== min){
                    System.out.println(s1);
                }
            }
        }else {
            System.out.println("программа завершена");
        }

    }

}
