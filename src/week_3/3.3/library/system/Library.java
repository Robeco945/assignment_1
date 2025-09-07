package system;

import model.Book;
import model.LibraryMember;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Book> borrowedBooks = new ArrayList<>();
    private ArrayList<LibraryMember> members = new ArrayList<>();

    // Add methods here
    public void addMember(LibraryMember member){members.add(member);}
    public void addBook(Book book){
        books.add(book);
    }
    public void displayBooks(){
        System.out.println("\nLibrary catologue: ");
        for (Book book : books) {
            System.out.println("\nTitle: " + book.getTitle() + "\n" +
                    "Author: " + book.getAuthor());
        }
        System.out.println("---------------------------------");
    }

    public void borrowBook(String title){
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                Book borrowed = books.get(i);
                books.remove(borrowed);
                borrowedBooks.add(borrowed);
            }
        }

        System.out.println("The title: '"+ title + "' has been borrowed");
        System.out.println("---------------------------------");
    }
    public void returnBook(Book book){
        if (borrowedBooks.contains(book)){
            books.add(book);
            borrowedBooks.remove(book);
        }
        System.out.println(book.getTitle() + " has been returned to the library");
    }
    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }
}