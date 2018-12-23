package lesson21Homework.Task01;

import java.util.concurrent.ConcurrentHashMap;

public class Library {
    private ConcurrentHashMap<Book,String> mapBooks;

    public Library() {
        mapBooks = new ConcurrentHashMap<>();
    }

    public ConcurrentHashMap<Book, String> getMapBooks() {
        return mapBooks;
    }

    public void setMapBooks(ConcurrentHashMap<Book, String> mapBooks) {
        this.mapBooks = mapBooks;
    }

    public ConcurrentHashMap<Book, String> addBooks(Book book ){
        mapBooks.putIfAbsent(book,book.getAftor());
        return mapBooks;
    }
    public ConcurrentHashMap<Book,String> remove(ConcurrentHashMap<Book,String> mapBooks, Book book){
        mapBooks.remove(book, book.getAftor());
        return mapBooks;
    }
}
