package payment.decorator;

public class ProcessingFeeDecorator extends PaymentDecorator {
    private final double fee;

    public ProcessingFeeDecorator(PaymentComponent wrappee, double fee) {
        super(wrappee);
        this.fee = fee;
    }

    @Override
    public double finalAmount() {
        return wrappee.finalAmount() + fee;
    }

    @Override
    public String description() {
        return wrappee.description() + " + Phi xu ly(" + fee + ")";
    }
}
