package Lesson4.TaskStrings;

import javax.xml.bind.SchemaOutputResolver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;
// 1) Найти в строке указанную подстроку и заменить ее на новую.
//Строку, ее подстроку для замены и новую подстроку вводит пользователь.

public class TaskString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку: ");
        String str = reader.readLine();
        System.out.println("Введите подстроку для замены: ");
        String str1 = reader.readLine();
        System.out.println("Введите новую подстроку: ");
        String str2 = reader.readLine();

        if (str.contains(str1)) {
            str = str.replace(str1, str2);
        } else {
            System.out.println("erro");
        }
        System.out.println(str);

        // 2) Требуется удалить из нее повторяющиеся символы и все пробелы.
        //Например, если было введено "abc cde def", то должно быть выведено "abcdef".

        String str3 = str.replaceAll(" ", "");
        System.out.println(str3);

        char [] chars = str3.toCharArray();
        Set<Character> charset = new LinkedHashSet<Character>();
        for(char c: chars){
            charset.add(c);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character character: charset){
            stringBuilder.append(character);
        }
        System.out.println(stringBuilder.toString());

        //3) Вводится строка, содержащая буквы, целые неотрицательные числа и иные символы.
        //Требуется все числа, которые встречаются в строке, поместить в отдельный целочисленный массив.
        //Например, если дана строка "дом 48, корпус 9, парадная 7, этаж 4", то в массиве должны оказаться числа 48, 9, 7 и 4

        String str4 = "дом 48, корпус 9, парадная 7, этаж 4";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <str4.length(); i++){
            char c = str4.charAt(i);
            if(Character.isDigit(c)){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}