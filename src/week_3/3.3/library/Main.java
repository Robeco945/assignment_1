import model.Book;
import model.LibraryMember;
import system.Library;

import java.util.Arrays;

public class Main {
    public static void main(String[] arg){
        Book book1 = new Book("Roberto Caretto", "The tale of the tail", 100312);
        Book book2 = new Book("Roberto Caretto", "The tale of the tail 2", 1003121);
        LibraryMember Roberto = new LibraryMember("Roberto Caretto", 0312);
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addMember(Roberto);
        library.reserveBook(Roberto, "The tale of the tail");
       library.deleteReservation(Roberto, "The tale of the tail");
        //library.borrowBook(Roberto,"The tale of the tail");
        //library.borrowBook(Roberto,"The tale of the tail 2");
        //System.out.println("books borrowed by Roberto: " +Roberto.getBorrowed());
        library.reserveBook(Roberto, "The tale of the tail");
        library.reserveBook(Roberto, "The tale of the tail");
        library.reserveBook(Roberto, "The tale of the tail 2");
        library.displayReservedBooks(Roberto);

    }
}
