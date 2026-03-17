package com.example.demo.strategy;

public class EWalletPayment implements PaymentStrategy {
    private final String walletName;
    private int balance;

    public EWalletPayment(String walletName, int balance) {
        this.walletName = walletName;
        this.balance = balance;
    }

    @Override
    public String getName() {
        return "Ví " + walletName;
    }

    @Override
    public PaymentResult pay(int amount) {
        if (balance < amount) {
            return new PaymentResult(false, "Số dư không đủ");
        }

        balance -= amount;
        return new PaymentResult(true, String.format("Thanh toán %,d VND. Số dư còn: %,d VND", amount, balance));
    }
}
