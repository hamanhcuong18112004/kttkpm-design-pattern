package payment.state;

public class FeeDiscountAppliedState implements PaymentState {
    @Override
    public void handle(PaymentContext context) {
        double afterFee = context.getAmount() + 10000;
        double afterDiscount = afterFee - 5000;
        context.setAmount(afterDiscount);
        System.out.println("Da ap dung phi + giam gia, so tien hien tai: " + context.getAmount());
        context.setState(new PaidState());
    }

    @Override
    public String name() {
        return "Da ap dung uu dai/phi";
    }
}
