package payment.state;

public class PaymentContext {
    private final String orderId;
    private PaymentState state;
    private String method;
    private double amount;

    public PaymentContext(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
        this.state = new InitState();
    }

    public void process() {
        System.out.println("State: " + state.name());
        state.handle(this);
    }

    public String getOrderId() {
        return orderId;
    }

    public String getMethod() {
        return method;
    }

    public double getAmount() {
        return amount;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setState(PaymentState state) {
        this.state = state;
    }
}
