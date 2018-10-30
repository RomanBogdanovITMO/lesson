package lesson6Homework.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String choise = reader.readLine();
        FileVide fileVide = new FileVide();
        fileVide.operation(choise);

    }
}
