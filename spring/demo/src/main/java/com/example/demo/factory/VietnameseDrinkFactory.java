package com.example.demo.factory;

import com.example.demo.factory.products.*;

public class VietnameseDrinkFactory extends DrinkFactory {
    @Override public Coffee createCoffee() { return new VietnameseCoffee(); }
    @Override public Tea createTea() { return new VietnameseTea(); }
}
