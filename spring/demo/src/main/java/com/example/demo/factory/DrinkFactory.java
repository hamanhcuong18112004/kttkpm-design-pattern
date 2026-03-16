package com.example.demo.factory;

import com.example.demo.factory.products.Coffee;
import com.example.demo.factory.products.Tea;

public abstract class DrinkFactory {
    public abstract Coffee createCoffee();  // Factory Method
    public abstract Tea createTea();        // Factory Method
}
