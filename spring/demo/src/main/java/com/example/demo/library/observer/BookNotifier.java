package com.example.demo.library.observer;

import java.util.ArrayList;
import java.util.List;

// ConcreteSubject - Thong bao ve sach
public class BookNotifier implements LibrarySubject {
    private List<LibraryObserver> observers;

    public BookNotifier() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(LibraryObserver observer) {
        observers.add(observer);
        System.out.println("  " + observer.getObserverName() + " da dang ky nhan thong bao.");
    }

    @Override
    public void removeObserver(LibraryObserver observer) {
        observers.remove(observer);
        System.out.println("  " + observer.getObserverName() + " da huy nhan thong bao.");
    }

    @Override
    public void notifyObservers(String message) {
        System.out.println("  [Thong bao] " + message);
        for (LibraryObserver observer : observers) {
            observer.update(message);
        }
    }

    public void notifyNewBook(String bookTitle) {
        notifyObservers("Sach moi: \"" + bookTitle + "\" da co tai thu vien!");
    }

    public void notifyBookAvailable(String bookTitle) {
        notifyObservers("Sach \"" + bookTitle + "\" da het han muon va co san tro lai!");
    }
}
