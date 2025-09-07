import model.Book;
import model.LibraryMember;
import system.Library;

public class Main {
    public static void main(String[] arg){
        Book book1 = new Book("Roberto Caretto", "The tale of the tail", 100312);
        LibraryMember Roberto = new LibraryMember("Roberto Caretto", 0312);
        Library library = new Library();
        library.addBook(book1);
        library.addMember(Roberto);
        library.borrowBook("The tale of the tail");
        library.returnBook(book1);
    }
}
