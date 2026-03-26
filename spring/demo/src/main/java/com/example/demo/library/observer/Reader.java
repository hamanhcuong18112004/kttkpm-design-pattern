package com.example.demo.library.observer;

// ConcreteObserver - Nguoi doc / doc gia
public class Reader implements LibraryObserver {
    private String name;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("    [Doc gia] " + name + " nhan thong bao: " + message);
    }

    @Override
    public String getObserverName() {
        return "Doc gia " + name;
    }
}
