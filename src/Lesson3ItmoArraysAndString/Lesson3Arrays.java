package Lesson3ItmoArraysAndString;

import sun.plugin.javascript.navig.Array;

import java.util.Arrays;

public class Lesson3Arrays {
    public static void main(String[] args) {
       /* int [] arr = new int[10];
        arr[2] = 4;
        arr[4] = 33;
        System.out.println(Arrays.toString(arr));

        int[] arr6 = new int[10];
        System.arraycopy(arr,3,arr6,2,3);
        System.out.println(Arrays.toString(arr6));

        int [] arrcopyarr = Arrays.copyOf(arr,15);
        System.out.println("arrcop " + Arrays.toString(arrcopyarr));

        int [] copyRanger = Arrays.copyOfRange(arr,2,5);
        System.out.println("arrcop " + Arrays.toString(copyRanger));


        int [] arr4 = {4,5,6,7,4,3,4,6};
        arr4 = new int[]{4,5,6,7,4,3,4,6};

        for (int i = 0; i < arr4.length; i++){
            arr4[i] += 100;
        }
        System.out.println(Arrays.toString(arr4));
        for (int num: arr4){
            System.out.println(num);
        }
        // сравнени массивов
        arr4 = new int[]{4,5,6,7,4,3,4,6};
        arr6 = new int[]{4,5,6,7,4,3,4,6};
        System.out.println(arr4 == arr6);
        System.out.println(arr4.equals(arr6));
        System.out.println(Arrays.equals(arr4,arr6));*/
       int [] arr8 = new int[14];
       Arrays.fill(arr8,343);
        System.out.println(Arrays.toString(arr8));
        arr8 = new int[]{3,7,1,5,2,6};
        Arrays.sort(arr8);
        System.out.println(Arrays.toString(arr8));
        System.out.println(Arrays.binarySearch(arr8,16));


    }
}
