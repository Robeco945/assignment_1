package model;

public class Book {
    private String author;
    private String title;
    private int isbn;
    public boolean reserved;
    public Book(String author, String title, int isbn) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.reserved = false;
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
    public boolean isReserved(){
        return reserved;
    }
    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }
}
