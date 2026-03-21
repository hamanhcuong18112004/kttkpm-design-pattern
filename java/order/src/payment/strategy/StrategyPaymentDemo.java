package payment.strategy;

public class StrategyPaymentDemo {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.setStrategy(new CreditCardStrategy());
        processor.checkout("DH101", 150000);

        processor.setStrategy(new PayPalStrategy());
        processor.checkout("DH102", 320000);
    }
}
