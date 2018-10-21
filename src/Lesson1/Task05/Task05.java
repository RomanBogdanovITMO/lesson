package Lesson1.Task05;

public class Task05 {
    public static void main(String[] args) {
        int value = 100;
        int a = value % 10;
        int b = (value / 10) % 10;
        int c = (value / 100) % 10;

        if(a > b & a > c){
            System.out.println(a);
        }else if (b > a & b > c){
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }
}
