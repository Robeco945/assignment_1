package system;

import model.Book;
import model.LibraryMember;

import java.util.ArrayList;


public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<LibraryMember> members = new ArrayList<>();

    // Add methods here
    public void addMember(LibraryMember member){members.add(member);}
    public void addBook(Book book){
        books.add(book);
    }
    public void displayReservedBooks(LibraryMember member){
        System.out.println(member.getName()+"'s reserved books: ");
        ArrayList<String> reservedBooks = member.getReserved();
        if (reservedBooks.isEmpty()) {
            System.out.println(member.getName() + " has no reserved books.");
            }
        else {for (String title : reservedBooks){System.out.println(title);}
        }
    }

    public void borrowBook(LibraryMember member, String title){
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                Book borrowedBook = books.get(i);
                books.remove(i);
                member.getBorrowed().add(borrowedBook.getTitle());
            }
        }

        System.out.println("The title: '"+ title + "' has been borrowed");
        System.out.println("---------------------------------");
    }
    public void returnBook(LibraryMember member, Book book){
        if (member.getBorrowed().contains(book)){
            books.add(book);
            member.borrowed.remove(book);
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
    public void reserveBook(LibraryMember member,String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isReserved()) {
                    System.out.println("The book '" + title + "' is already reserved.");
                    System.out.println("---------------------------------");
                }
                else {

                    book.setReserved(true);
                    member.getReserved().add(book.getTitle());
                    System.out.println("The book '" + title + "' has been reserved by " + member.getName());
                    System.out.println("---------------------------------");
                }
            }
        }
    }
    public void deleteReservation (LibraryMember member, String title){
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isReserved()) {
                    book.setReserved(false);
                    member.getReserved().remove(book.getTitle());
                    System.out.println("The book '" + title + "' has been deleted from "+member.getName()+"'s reserved list");
                    System.out.println("---------------------------------");
                }
                else {
                    System.out.println("The book '" + title + "' has not been reserved");
                    System.out.println("---------------------------------");
                }
            }
        }
        }
    }