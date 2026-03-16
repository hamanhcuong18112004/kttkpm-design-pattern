package com.example.demo.factory.products;

public class VietnameseCoffee implements Coffee {
    @Override public String prepare() { return "Pha cà phê sữa đá kiểu VN"; }
    @Override public int getPrice() { return 35000; }
    @Override public String getDescription() { return "Cà phê sữa đá"; }
    @Override public int getCost() { return getPrice(); }
}
