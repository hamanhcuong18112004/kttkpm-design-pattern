package payment.state;

public class MethodSelectedState implements PaymentState {
    @Override
    public void handle(PaymentContext context) {
        context.setMethod("CreditCard");
        System.out.println("Da chon phuong thuc: " + context.getMethod());
        context.setState(new FeeDiscountAppliedState());
    }

    @Override
    public String name() {
        return "Da chon phuong thuc";
    }
}
