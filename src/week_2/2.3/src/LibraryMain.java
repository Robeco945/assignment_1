public class LibraryMain {
    public static void main(String[] args){
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book2 = new Book("The Picture of Dorian Gray", "Oscar Wilde", 1890);
        Book book3 = new Book("Frankenstein", "Mary Shelley", 1818);
        Book book4 = new Book("Tender Is The Night", "F. Scott Fitzgerald", 1934);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.displayBooks();
        library.findBooksByAuthor("F. Scott Fitzgerald");
    }
}
