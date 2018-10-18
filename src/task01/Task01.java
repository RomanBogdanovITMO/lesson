package task01;

public class Task01 {
    public static void main(String[] args) {
        int height,long1, width ;
        height = 30;
        long1 = 40;
        width = 10;
        int square = 2 *((long1 * width) + (width * height) + (long1 * height));
        System.out.println("square = " + square);
        if(height > width){
            System.out.println("height = " + height);
        }else {
            System.out.println("width =" + width);
        }
    }
}
