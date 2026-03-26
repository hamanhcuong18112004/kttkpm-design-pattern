package com.example.demo.library.factory;

// Abstract Product - Lop co so cho tat ca loai sach
public abstract class Book {
    private String title;
    private String author;
    private String genre;
    private boolean available;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = true;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    public abstract String getType();

    @Override
    public String toString() {
        return "[" + getType() + "] \"" + title + "\" - " + author + " (" + genre + ") " 
               + (available ? "[Co san]" : "[Da muon]");
    }
}
