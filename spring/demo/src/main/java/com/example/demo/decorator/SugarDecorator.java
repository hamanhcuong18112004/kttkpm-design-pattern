package com.example.demo.decorator;

public class SugarDecorator extends BeverageDecorator {
    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Đường";
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 5000;
    }
}