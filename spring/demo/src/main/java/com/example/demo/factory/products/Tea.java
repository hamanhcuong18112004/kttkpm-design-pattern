package com.example.demo.factory.products;

import com.example.demo.decorator.Beverage;

public interface Tea extends Beverage {
    String brew();
    int getPrice();
}
