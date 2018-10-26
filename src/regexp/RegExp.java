package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {
        String string = "Строка 1 для поиска и замены СИМВОЛОВ ё";
        String pattern = "иск";
        System.out.println(string.replaceAll(pattern, "*!*"));

        pattern = "^Стр$"; // $- конец стоки
        System.out.println(string.replaceAll(pattern,"*!*"));

        pattern = "[иск]";//перечень символов
        System.out.println(string.replaceAll(pattern,"*"));
        pattern = "[^иск]";//  все будет заменено кроме этих имволов [];
        System.out.println(string.replaceAll(pattern,"*"));
        pattern = "\\D";// поиск цифрового символа. D - не цифровой символ.
        System.out.println(string.replaceAll(pattern,"*"));
        pattern = "\\w";
        System.out.println(string.replaceAll(pattern,"*"));
        pattern = "\\W";
        System.out.println(string.replaceAll(pattern,"*"));
        pattern = "\\s";
        System.out.println(string.replaceAll(pattern,"*"));

        pattern = "[а-я]";
        System.out.println(string.replaceAll(pattern,"*"));

        pattern = "[А-Яё]";
        System.out.println(string.replaceAll(pattern,"*"));
        pattern = "[А-Я0-9]";
        System.out.println(string.replaceAll(pattern,"*"));

        string = "String B1 to search and replace CHARS";
       // string = "Str";
        Pattern pattern1 = Pattern.compile(".{6,}");
        pattern1 = Pattern.compile("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8}");
        Matcher matcher = pattern1.matcher(string);
        System.out.println(matcher.find());
    }
}
