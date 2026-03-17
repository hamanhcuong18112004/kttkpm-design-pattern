package com.example.demo.strategy;

public interface PaymentStrategy {
    String getName();

    PaymentResult pay(int amount);
}
