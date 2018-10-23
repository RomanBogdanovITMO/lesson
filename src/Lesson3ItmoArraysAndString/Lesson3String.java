package Lesson3ItmoArraysAndString;

import java.util.Arrays;

public class Lesson3String {
    public static void main(String[] args) {
        String str0 = "String";
        String str = new String("String");
        String str1 = String.format("String %02d", 10);

        System.out.println(str1);

        String str2 = "String String";
        String str3 = "String";

        System.out.println(str0 == str);
        System.out.println(str.equals(str3));

        System.out.println(str.equalsIgnoreCase(str3));

        System.out.println(str.startsWith("S"));

        System.out.println(str.endsWith("c"));

        String str10 = "String";
        String str11 =new String( "string");
        String str12 = "Str";
        String str13 = "String String";

        System.out.println(str10.compareTo(str11));
        System.out.println(str11.compareTo(str12));
        System.out.println(str11.compareTo(str13));
        System.out.println(str11.equalsIgnoreCase(str13));

        String a = "Astring";
        String b = "Bstring";
        String c = "Строка \n \"строка\"";
        String [] strArr = {a,b,c};
        Arrays.sort(strArr);
        String aq = "ssss";

        System.out.println(Arrays.toString(strArr));

        System.out.println(c.substring(3,11));
        System.out.println(a.contains(aq));

        String string = "first ";
        String second = " second";
        System.out.println(string +" " + second);

        for (int i =0; i < 10; i++){
            string += second;
        }
        System.out.println(string);

        StringBuilder stringBuilder = new StringBuilder();// не создает новый обьект а доплоняет старый обект(линию) новым дополнением.
        stringBuilder.append(string);
        for (int i =0; i < 10; i++){
            stringBuilder.append("string ").append("str ");
        }
        System.out.println(stringBuilder.toString());

    }
}
