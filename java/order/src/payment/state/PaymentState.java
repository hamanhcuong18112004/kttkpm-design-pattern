package payment.state;

public interface PaymentState {
    void handle(PaymentContext context);

    String name();
}
