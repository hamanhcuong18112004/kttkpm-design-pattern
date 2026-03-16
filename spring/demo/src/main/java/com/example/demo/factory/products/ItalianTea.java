package com.example.demo.factory.products;

public class ItalianTea implements Tea {
    @Override public String brew() { return "Pha Tè alla pesca kiểu Ý"; }
    @Override public int getPrice() { return 40000; }
    @Override public String getDescription() { return "Tè alla pesca"; }
    @Override public int getCost() { return getPrice(); }
}
