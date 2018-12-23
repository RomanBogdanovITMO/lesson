package lesson21Homework.Task01;



import java.util.Scanner;


/**Задача 1
        Библиотека. Доступны для чтения несколько книг.
        Одинаковых книг в библиотеке нет.
        Некоторые выдаются на руки, некоторые только в читальный зал.
        Читатель может брать на руки и в читальный зал несколько книг.*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book1 = new Book("book1","aftor1");
        Book book2 = new Book("Book2","aftor2");
        Book book3 = new Book("Book3","aftor2");
        Book book4 = new Book("Book4","aftor2");
        Book book5 = new Book("Book5","aftor2");

        Library library = new Library();
        library.addBooks(book1);
        library.addBooks(book2);
        library.addBooks(book3);
        library.addBooks(book4);
        library.addBooks(book5);


        System.out.println("список книг на данный момент: " + library.getMapBooks());
        System.out.println("Какую книгу вы выбираете: ");
        Reader reader = new Reader();
        String vibor = scanner.nextLine();
        for (Book bk:library.getMapBooks().keySet()){
            if ((bk.getNameBook()).equals(vibor)) {
                reader.setBook(bk);
                System.out.println(reader.getBook());
                break;
            }
        }
        System.out.println("если хотите забать книгу напишите (забрать), если вернуть (вернуть).");
        Reader reader1 = new Reader("Roman",library,reader.getBook());


        new Thread(reader1).start();
        new Thread(reader1).start();


    }
}
