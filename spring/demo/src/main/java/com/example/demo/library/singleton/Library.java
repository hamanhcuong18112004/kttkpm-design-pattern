package com.example.demo.library.singleton;

import com.example.demo.library.factory.Book;
import java.util.ArrayList;
import java.util.List;

// Singleton - Thu vien duy nhat
public class Library {
    private static Library instance;
    private List<Book> books;
    private String name;

    // Private constructor
    private Library() {
        this.books = new ArrayList<>();
        this.name = "Thu Vien Trung Tam";
    }

    // Singleton getInstance
    public static Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    public String getName() { return name; }

    // Them sach
    public void addBook(Book book) {
        books.add(book);
        System.out.println("  Da them: " + book);
    }

    // Tra sach
    public void returnBook(Book book) {
        book.setAvailable(true);
        System.out.println("  Da tra: " + book.getTitle());
    }

    // Muon sach
    public boolean borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("  Da muon: " + book.getTitle());
            return true;
        }
        System.out.println("  Sach \"" + book.getTitle() + "\" da duoc muon!");
        return false;
    }

    // Lay danh sach sach
    public List<Book> getBooks() {
        return books;
    }

    // Hien thi tat ca sach
    public void displayAllBooks() {
        System.out.println("\n  === " + name + " - Danh sach sach ===");
        if (books.isEmpty()) {
            System.out.println("  (Khong co sach)");
            return;
        }
        for (int i = 0; i < books.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + books.get(i));
        }
        System.out.println("  Tong: " + books.size() + " sach");
    }
}
