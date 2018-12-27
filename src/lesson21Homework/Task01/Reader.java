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

    public Reader(String name, Library library ) {
        this.name = name;
       // this.book = book;
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
        String vibor = null;
        boolean flag = true;
        System.out.println("список книг на данный момент: " + library.getMapBooks());
        while (flag) {
            System.out.println("Какую книгу вы выбираете: ");
            vibor = scanner.nextLine();
            System.out.println(vibor);
            for (Book bk : library.getMapBooks().keySet()) {
                if ((bk.getNameBook()).equals(vibor)) {
                    listBooks.add(bk);
                    System.out.println("Добавили книгу");
                    library.remove(library.getMapBooks(), bk);
                    System.out.println(listBooks);
                    System.out.println("Вы нужна еще книга: да, нет");
                    String str = scanner.nextLine();
                    if (str.equals("нет")) {
                        flag = false;
                    }
                    break;
                }
            }
        }
        System.out.println("");
        System.out.println("доступные книги в библиотеке: " + library.getMapBooks() + "\n");
        boolean flag1 = true;
        while (flag1) {
            System.out.println("какую книгу хотите вернуть?");
            String str2 = scanner.nextLine();
            for (Book bk : listBooks) {
                if (str2.equals(bk.getNameBook())) {
                    System.out.println(bk.getNameBook());
                    listBooks.remove(bk);
                    library.addBooks(bk);
                    System.out.println("Книги в библиотеке: " + library.getMapBooks());
                    System.out.println("Повторить операцию: да, нет ?");
                    String str3 = scanner.nextLine();
                    if (str3.equals("нет")) {
                        flag1 = false;
                    }
                    break;
                }

            }
        }
        System.out.println("______________________________________________");
        System.out.println("Всего книг в библиотеке: " + library.getMapBooks());
        System.out.println("_______________________________________________");
        System.out.println("Остаток книг у читателя" + listBooks);
    }
}
