package lesson11Homework.Task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Integer> list;
    static List<Integer> list2;
    static List<Integer> list3;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         list = new ArrayList<>();
         list2 = new ArrayList<>();
        list3 = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int j = 0; j < list.size(); j++){
            if(list.get(j)%3 == 0) {
                list3.add(list.get(j));
            }
             if(list.get(j)%2 == 0) {
                list2.add(list.get(j));
            }
        }
        printList();
        printList1("leedew");
        }

        public static   void printList(){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        for(int i = 0; i <list2.size(); i++){
            System.out.println(list2.get(i));
        }
        for(int j = 0; j < list3.size(); j++){
            System.out.println(list3.get(j));
        }
        }
        public static void printList1(String name){
        if(name.equals("list")){
            System.out.println(list);
        }else if(name.equals("list2")){
            System.out.println(list2);
        }else if(name.equals("list3")){
            System.out.println(list3);
        }else{
            System.out.println("совпадений не найдено");
        }
        }
     }


