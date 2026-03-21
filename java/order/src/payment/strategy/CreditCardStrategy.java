package payment.strategy;

public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public void pay(String orderId, double amount) {
        System.out.println("Thanh toan don " + orderId + " bang The tin dung: " + amount);
    }

    @Override
    public String name() {
        return "The tin dung";
    }
}
