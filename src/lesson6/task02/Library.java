package lesson6.task02;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;

public class Library {
    int size = 3;
    Book[] books = new Book[size];
    int count =3;
    int countBooks = 3;

    public void add(Book book){
        for(int i = 0; i< books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                count--;
                return;
            }

        }
        System.out.println("Места нет");
    }

    public void remove(Book book){
        for(int i = 0; i < books.length; i++) {
            if (book.getName().equals(books[i])){
                book.getName().equals(null);
                count--;
                return;
            }
        }
        System.out.println("полка свободна");
    }
    public void showLibrary(){
        System.out.println("количество свободных мест " + count );
        System.out.println("количество книг на полке " + countBooks);

    }
}



