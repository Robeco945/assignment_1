package model;

public class Book {
    private String author;
    private String title;
    private int isbn;
    public Book(String author, String title, int isbn) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    public int getIsbn(){
        return isbn;
    }
}
