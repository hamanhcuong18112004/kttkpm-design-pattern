package com.example.demo.library.observer;

// ConcreteObserver - Nhan vien thu vien
public class Librarian implements LibraryObserver {
    private String name;

    public Librarian(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("    [NV Thu vien] " + name + " nhan thong bao: " + message);
    }

    @Override
    public String getObserverName() {
        return "NV " + name;
    }
}
