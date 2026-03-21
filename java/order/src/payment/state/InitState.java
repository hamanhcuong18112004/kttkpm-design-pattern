package payment.state;

public class InitState implements PaymentState {
    @Override
    public void handle(PaymentContext context) {
        System.out.println("Khoi tao giao dich cho don: " + context.getOrderId());
        context.setState(new MethodSelectedState());
    }

    @Override
    public String name() {
        return "Khoi tao";
    }
}
