package lesson6.task02;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;

public class Library {
    int size = 3;
    Book[] books = new Book[size];
    int countadd =0;
    int countRemove =0;


    public void add(Book book){
        for(int i = 0; i< books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                countadd++;
                return;
            }

        }
        System.out.println("Места нет, всего на полке три места.");
    }

    public void remove(Book book){
        for(int i = 0; i < books.length; i++) {
            if (book.getName().equals(books[i].getName())){
                books[i]= null;
                countRemove++;
                return;
            }

        }
        System.out.println("полка свободна");
    }


     public void showLibrary(){

        System.out.println("количество книг на полке: " + countadd );
        System.out.println(Arrays.toString(books));
        System.out.println("мест свободно: " + countRemove );


    }
}



