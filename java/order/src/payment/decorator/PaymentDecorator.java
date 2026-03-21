package payment.decorator;

public abstract class PaymentDecorator implements PaymentComponent {
    protected final PaymentComponent wrappee;

    protected PaymentDecorator(PaymentComponent wrappee) {
        this.wrappee = wrappee;
    }
}
