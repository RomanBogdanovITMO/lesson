package Lesson4.Task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int NumberRandom = -5;
        int arr0 = 0;
        int LeftCountArr = 0;
        int RightCountArr = 0;
        try {
            boolean erro = true;
            while (erro == true) {
                 arr0 = Integer.parseInt(reader.readLine());
                if ((arr0 % 2) == 0 & arr0 > 0) {
                    erro = false;
                } else {
                    System.out.println("Вы ввели не верное число, повторите попытку. ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int [] arr1 = new int[arr0];
        for(int i =0 ; i< arr1.length; i++) {
            int random = NumberRandom + (int) (Math.random() * 10);
            arr1[i] = random;
            if (i <= arr1.length / 2 - 1) {
                LeftCountArr += Math.abs(arr1[i]);
            } else {
                RightCountArr += Math.abs(arr1[i]);
            }
        }
            System.out.println(Arrays.toString(arr1));
        System.out.println(" ");
            if(LeftCountArr > RightCountArr){
                System.out.println("Сумма левой половиы массива больше правой: " + LeftCountArr);
            }else if(LeftCountArr < RightCountArr){
                System.out.println("Сумма правой половины масива больше левой: " + RightCountArr);
            }else{
                System.out.println("Обе стороны равны");
            }

        }

    }

