package com.example.demo.library.factory;

// Concrete Product - Sach noi
public class AudioBook extends Book {
    private double durationHours;
    private String narrator;

    public AudioBook(String title, String author, String genre, double durationHours, String narrator) {
        super(title, author, genre);
        this.durationHours = durationHours;
        this.narrator = narrator;
    }

    public double getDurationHours() { return durationHours; }
    public String getNarrator() { return narrator; }

    @Override
    public String getType() { return "Sach Noi"; }

    @Override
    public String toString() {
        return super.toString() + " - " + durationHours + "h, doc boi: " + narrator;
    }
}
