package payment.decorator;

public class BasePayment implements PaymentComponent {
    private final double amount;

    public BasePayment(double amount) {
        this.amount = amount;
    }

    @Override
    public double finalAmount() {
        return amount;
    }

    @Override
    public String description() {
        return "So tien goc";
    }
}
