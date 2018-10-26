package lesson6.task02;

public class Library {
    int size = 5;
    Book[] books = new Book[size];

    public void Add(Book book,String name ){
        for(int i = 0; i< books.length; i++){
            if(books[i] == null){
                books[i] = book;
            }else{
                return;
            }
            System.out.println("Места нет");
        }
    }
}



