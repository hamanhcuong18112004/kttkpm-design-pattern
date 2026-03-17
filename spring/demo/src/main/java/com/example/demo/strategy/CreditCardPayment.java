package com.example.demo.strategy;

public class CreditCardPayment implements PaymentStrategy {
    private final String cardNumber;
    private final double feeRate = 0.02;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String getName() {
        return "Thẻ tín dụng";
    }

    @Override
    public PaymentResult pay(int amount) {
        if (cardNumber == null || cardNumber.length() != 16) {
            return new PaymentResult(false, "Số thẻ không hợp lệ");
        }

        int fee = (int) Math.round(amount * feeRate);
        return new PaymentResult(true, String.format("Thanh toán %,d VND. Phí: %,d VND. Tổng: %,d VND", amount, fee, amount + fee));
    }
}
