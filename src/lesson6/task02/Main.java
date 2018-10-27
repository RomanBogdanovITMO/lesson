package lesson6.task02;

public class Main {
    public static void main(String[] args) {
     Book book1 = new Book();
     book1.setName("книга 1");
     Book book2 = new Book();
     book2.setName("Книга2");
     Book book3 = new Book();
     Book book4 = new Book();
     book3.setName("Книга3");
     book4.setName("Книга4");
     Library library = new Library();
     library.add(book1);
     library.add(book2);
     library.add(book3);
     library.remove(book1);
     library.showLibrary();

    }
}
