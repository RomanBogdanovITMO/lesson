package Lesson2.Task05;

public class Task05 {
    public static void main(String[] args) {
        int b = 0;
        for(int i = 1; i <=24; i ++){
            for(int j = 0; j <=59; j++){
                if(i/10%10 == j%10 & i%10 == j/10%10){
                    b++;
                }
            }
        }
        System.out.println("Соличество комбинаций: " + b);
    }
}
