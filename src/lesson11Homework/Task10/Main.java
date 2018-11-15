package lesson11Homework.Task10;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> list = new TreeSet<>();

        for(int i = 0; i <20; i++){
            list.add(i*2);
        }
        System.out.println(list);
        System.out.println("");

        for (Iterator<Integer> iteratorr = list.iterator();iteratorr.hasNext();)
            if (iteratorr.next() > 10) {
                iteratorr.remove();
            }
        System.out.println(list);
    }

}
