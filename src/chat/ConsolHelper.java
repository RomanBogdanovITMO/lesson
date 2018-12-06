package chat;

import java.util.Scanner;

public class ConsolHelper {
    public  static  void writeString(String str){
        System.out.println(str);
    }
    public static  String readString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
