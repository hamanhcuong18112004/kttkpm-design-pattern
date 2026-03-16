package com.example.demo.factory.products;

public class VietnameseTea implements Tea {
    @Override public String brew() { return "Pha trà đá kiểu VN"; }
    @Override public int getPrice() { return 15000; }
    @Override public String getDescription() { return "Trà đá"; }
    @Override public int getCost() { return getPrice(); }
}
