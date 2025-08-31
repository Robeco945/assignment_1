import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Book> borrowedBooks = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    // Add methods here
    public void addBook(Book book){
        books.add(book);
    }
    public void displayBooks(){
        System.out.println("\nLibrary catologue: ");
        for (Book book : books) {
            System.out.println("\nTitle: " + book.getTitle() + "\n" +
                    "Author: " + book.getAuthor() + "\n" +
                    "Year published: " + book.getYear());
        }
        System.out.println("---------------------------------");
    }
    public void findBooksByAuthor(String author){
        System.out.println("\nBooks by the author "+ author +": ");
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("\nTitle: " + book.getTitle() + "\n" +
                        "Author: " + book.getAuthor() + "\n" +
                        "Year published: " + book.getYear());
            }
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
    public double getAverageBookRating(){
        double avg = 0;
        double total = 0;
        int i = 0;
        for (i = 0; i < books.size(); i++) {
            total += books.get(i).getRating();
        }
        avg = total / i;
        return avg;
    }
    public String getMostReviewedBook(){
        int max = 0;
        String highest = "";
        for (Book book : books){
            if (book.getReviewCount() > max) {
                max = book.getReviewCount();
                highest = book.getTitle();
            }

        }
        return highest;
    }
}