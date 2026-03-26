package com.example.demo.library.factory;

// Concrete Product - Sach giay
public class PaperBook extends Book {
    private int pageCount;

    public PaperBook(String title, String author, String genre, int pageCount) {
        super(title, author, genre);
        this.pageCount = pageCount;
    }

    public int getPageCount() { return pageCount; }

    @Override
    public String getType() { return "Sach Giay"; }

    @Override
    public String toString() {
        return super.toString() + " - " + pageCount + " trang";
    }
}
