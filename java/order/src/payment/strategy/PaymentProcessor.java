package payment.strategy;

public class PaymentProcessor {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void checkout(String orderId, double amount) {
        if (strategy == null) {
            throw new IllegalStateException("Chua chon phuong thuc thanh toan");
        }
        System.out.println("Dang dung strategy: " + strategy.name());
        strategy.pay(orderId, amount);
    }
}
