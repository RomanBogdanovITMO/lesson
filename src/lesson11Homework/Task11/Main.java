package lesson11Homework.Task11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        timeAddLinkedList();
       // timAddArrayList();
        timeremoveLinkedList(timeAddLinkedList());
    }
    public static List<Integer> timeAddLinkedList() {
        List<Integer> list = new LinkedList<>();
        Long start = System.nanoTime();
        for (int i = 0; i < 10_000; i++) {
            list.add(i);
        }
        long finish = System.nanoTime();
        long time = finish - start;
        //System.out.println(time);
        return list;
    }
    public static void timAddArrayList() {
        List<Integer> list1 = new ArrayList<>();
        long start,finish,end;
        start = System.nanoTime();
        for(int i = 0; i < 10_000; i++){
            list1.add(i);
        }
        finish = System.nanoTime();

        System.out.println(end = finish - start);
    }
    public static void timeremoveLinkedList(List<Integer> list){
        list = timeAddLinkedList();
        Long st,fi, end;
        st = System.nanoTime();
        for(Iterator<Integer> it = list.iterator();it.hasNext();){
            it.next();
            it.remove();
        }
        fi = System.nanoTime();
        System.out.println(end = fi - st);
    }
}
