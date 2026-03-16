package com.example.demo.factory.products;

import com.example.demo.decorator.Beverage;

public interface Coffee extends Beverage {
    String prepare();
    int getPrice();
}
