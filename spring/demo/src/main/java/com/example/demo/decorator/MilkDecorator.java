package com.example.demo.decorator;

public class MilkDecorator extends BeverageDecorator {
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Sữa";
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 10000;
    }
}