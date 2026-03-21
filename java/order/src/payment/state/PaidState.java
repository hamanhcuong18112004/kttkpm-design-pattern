package payment.state;

public class PaidState implements PaymentState {
    @Override
    public void handle(PaymentContext context) {
        System.out.println(
            "Thanh toan thanh cong don " + context.getOrderId()
                + " bang " + context.getMethod()
                + ", so tien cuoi: " + context.getAmount());
    }

    @Override
    public String name() {
        return "Da thanh toan";
    }
}
