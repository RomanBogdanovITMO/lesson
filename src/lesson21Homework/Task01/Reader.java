package lesson21Homework.Task01;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader implements Runnable {
    private String name;
    private List<Book> listBooks;
    Library library;
    Book book;

    public Reader(String name, Library library, Book book) {
        this.name = name;
        this.book = book;
        this.library = library;
        listBooks = new ArrayList<>();
    }

    public Reader() {
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }


    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
       String str = scanner.nextLine();
       if(str.equals("забрать")) {
           listBooks.add(book);
           library.remove(library.getMapBooks(), book);
           System.out.println(library.getMapBooks());
       }else if(str.equals("вернуть")) {
           int count = listBooks.size();
           if (count == 0){
               System.out.println("у вас нет книг что бы вернуть");
           }
           library.addBooks(book);
           System.out.println(library.getMapBooks());
       }else {
           System.out.println("указана неверная комманда");
       }
    }
}
