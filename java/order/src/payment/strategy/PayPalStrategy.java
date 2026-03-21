package payment.strategy;

public class PayPalStrategy implements PaymentStrategy {
    @Override
    public void pay(String orderId, double amount) {
        System.out.println("Thanh toan don " + orderId + " bang PayPal: " + amount);
    }

    @Override
    public String name() {
        return "PayPal";
    }
}
