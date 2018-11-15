package lesson11Homework.Task13;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String>[] arrayListsOfString = createList();
        printList(arrayListsOfString);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] ar = new ArrayList[10];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = new ArrayList<String>();
            ar[i].add("string" + i);
        }
        return ar;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
