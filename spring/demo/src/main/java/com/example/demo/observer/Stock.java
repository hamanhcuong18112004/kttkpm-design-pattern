package com.example.demo.observer;

import java.util.ArrayList;
import java.util.List;

// ConcreteSubject - Co phieu
public class Stock implements Subject {
    private String symbol;
    private double price;
    private List<Observer> observers;

    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
        this.observers = new ArrayList<>();
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        double oldPrice = this.price;
        this.price = newPrice;
        System.out.println("\n[Stock] " + symbol + ": gia thay doi " + oldPrice + " -> " + newPrice);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        String message = "Gia co phieu " + symbol + " hien tai: " + price;
        for (Observer observer : observers) {
            observer.update(symbol, message);
        }
    }
}
