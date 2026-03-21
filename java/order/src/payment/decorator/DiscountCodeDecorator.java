package payment.decorator;

public class DiscountCodeDecorator extends PaymentDecorator {
    private final double discount;

    public DiscountCodeDecorator(PaymentComponent wrappee, double discount) {
        super(wrappee);
        this.discount = discount;
    }

    @Override
    public double finalAmount() {
        return Math.max(0, wrappee.finalAmount() - discount);
    }

    @Override
    public String description() {
        return wrappee.description() + " - Ma giam gia(" + discount + ")";
    }
}
