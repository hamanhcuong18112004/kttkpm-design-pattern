package com.example.demo.strategy;

public class CashPayment implements PaymentStrategy {
    private final int cashGiven;

    public CashPayment(int cashGiven) {
        this.cashGiven = cashGiven;
    }

    @Override
    public String getName() {
        return "Tiền mặt";
    }

    @Override
    public PaymentResult pay(int amount) {
        if (cashGiven < amount) {
            return new PaymentResult(false, "Thiếu " + (amount - cashGiven) + " VND");
        }

        return new PaymentResult(true, String.format("Thanh toán %,d VND. Tiền thừa: %,d VND", amount, cashGiven - amount));
    }
}
