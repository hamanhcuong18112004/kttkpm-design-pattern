package com.example.demo.library.factory;

// Concrete Product - Sach dien tu
public class EBook extends Book {
    private String format; // PDF, EPUB, MOBI
    private double fileSizeMB;

    public EBook(String title, String author, String genre, String format, double fileSizeMB) {
        super(title, author, genre);
        this.format = format;
        this.fileSizeMB = fileSizeMB;
    }

    public String getFormat() { return format; }
    public double getFileSizeMB() { return fileSizeMB; }

    @Override
    public String getType() { return "Sach Dien Tu"; }

    @Override
    public String toString() {
        return super.toString() + " - " + format + " (" + fileSizeMB + " MB)";
    }
}
