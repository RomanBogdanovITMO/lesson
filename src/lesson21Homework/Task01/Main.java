package lesson21Homework.Task01;

/**Задача 1
        Библиотека. Доступны для чтения несколько книг.
        Одинаковых книг в библиотеке нет.
        Некоторые выдаются на руки, некоторые только в читальный зал.
        Читатель может брать на руки и в читальный зал несколько книг.*/

public class Main {
    public static void main(String[] args) {

        Book MasterAndMargarita = new Book("MasterAndMargarita","Булгаков");
        Book book2 = new Book("Book2","aftor2");
        Book book3 = new Book("Book3","aftor2");
        Book book4 = new Book("Book4","aftor2");
        Book book5 = new Book("Book5","aftor2");

        Library library = new Library();
        library.addBooks(MasterAndMargarita);
        library.addBooks(book2);
        library.addBooks(book3);
        library.addBooks(book4);
        library.addBooks(book5);

        Reader reader1 = new Reader("Roman",library);
        new Thread(reader1).start();




    }
}
