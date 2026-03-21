package payment.state;

public class FailedState implements PaymentState {
    @Override
    public void handle(PaymentContext context) {
        System.out.println("Thanh toan that bai don " + context.getOrderId());
    }

    @Override
    public String name() {
        return "That bai";
    }
}
