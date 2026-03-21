package payment.strategy;

public interface PaymentStrategy {
    void pay(String orderId, double amount);

    String name();
}
