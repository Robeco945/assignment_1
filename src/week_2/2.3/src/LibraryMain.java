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
        library.borrowBook("Tender is the night");
        System.out.println("Book available? "+library.isBookAvailable("Tender Is The night"));
        library.displayBooks();
        library.returnBook(book4);
        System.out.println("Book available? "+library.isBookAvailable("Tender Is The night"));
        book1.setRating(5);
        book2.setRating(5);
        book3.setRating(5);
        book4.setRating(4);
        book1.addReview("good");
        book1.addReview("nice");
        book2.addReview("good");
        book3.addReview("good");
        book4.addReview("good");
        System.out.println("The average rating of all books in the library is: "+library.getAverageBookRating());
        System.out.println("review count for book 1: "+book1.getReviewCount());
        System.out.println("Book with highest number of reviews: "+ library.getMostReviewedBook());
    }
}
