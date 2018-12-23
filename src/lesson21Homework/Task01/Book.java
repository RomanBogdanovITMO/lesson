package lesson21Homework.Task01;

public class Book {
    private String nameBook;
    private String aftor;

    public Book(String nameBook, String aftor) {
        this.nameBook = nameBook;
        this.aftor = aftor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", aftor='" + aftor + '\'' +
                '}';
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAftor() {
        return aftor;
    }

    public void setAftor(String aftor) {
        this.aftor = aftor;
    }
}
