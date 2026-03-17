package com.example.demo.decorator;

public abstract class BeverageDecorator implements Beverage {
    protected final Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public int getCost() {
        return beverage.getCost();
    }
}