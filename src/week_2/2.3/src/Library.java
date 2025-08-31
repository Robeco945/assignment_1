import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Add methods here
    public void addBook(Book book){
        books.add(book);
    }
    public void displayBooks(){
        for (int i = 0; i < books.size(); i++){
            System.out.println("\nTitle: "+books.get(i).getTitle()+"\n"+
                    "Author: " + books.get(i).getAuthor() + "\n" +
                    "Year published: " + books.get(i).getYear());
        }
    }
    public void findBooksByAuthor(String author){
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getAuthor().equalsIgnoreCase(author)){
                System.out.println("\nBook by the author "+ author +"\nTitle: "+books.get(i).getTitle()+"\n"+
                        "Author: " + books.get(i).getAuthor() + "\n" +
                        "Year published: " + books.get(i).getYear());
            }
        }
    }
}