package Lesson2.Task03;

public class Task03 {
    public static void main(String[] args) {
        int number = 1;
        for(int i = 0; i < 21; i++){
            int count = number * 2;
            number = count;
            System.out.println(number);
        }
    }
}
