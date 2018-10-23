package Lesson4.Task01;

public class Task01 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int a = 1;
        int b = 1;
        for(int i = 0; i< arr.length; i++){
            a++;
            if(a%2==0){
                arr[i] = a;
                System.out.print(arr[i] + "\n");
            }
        }
        for(int j = 0; j <arr.length; j++){
            b++;
            if(b%2==0){
                arr[j] = b;
                System.out.print(arr[j] + " ");
            }
        }
    }
}
