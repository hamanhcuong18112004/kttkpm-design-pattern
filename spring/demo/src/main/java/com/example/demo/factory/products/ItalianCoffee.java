package com.example.demo.factory.products;

public class ItalianCoffee implements Coffee {
    @Override public String prepare() { return "Pha Espresso kiểu Ý"; }
    @Override public int getPrice() { return 55000; }
    @Override public String getDescription() { return "Espresso"; }
    @Override public int getCost() { return getPrice(); }
}
