package com.example.demo.decorator;

public class WhipCreamDecorator extends BeverageDecorator {
    public WhipCreamDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Kem tươi";
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 15000;
    }
}