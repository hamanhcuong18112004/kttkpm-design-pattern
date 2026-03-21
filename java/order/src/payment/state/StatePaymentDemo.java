package payment.state;

public class StatePaymentDemo {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext("DH100", 200000);
        context.process();
        context.process();
        context.process();
        context.process();
    }
}
