package com.example.demo.decorator;

public class BobaPearlDecorator extends BeverageDecorator {
    public BobaPearlDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Trân châu";
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 12000;
    }
}