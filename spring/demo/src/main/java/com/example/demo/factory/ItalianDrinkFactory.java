package com.example.demo.factory;

import com.example.demo.factory.products.*;

public class ItalianDrinkFactory extends DrinkFactory {
    @Override public Coffee createCoffee() { return new ItalianCoffee(); }
    @Override  public Tea createTea() { return new ItalianTea(); }
}
