package order.state;

public class Order {
    private final String orderId;
    private IOrderState state;

    public Order(String orderId) {
        this.orderId = orderId;
        this.state = new NewState();
    }
     public void process() {
        state.name();   
        state.handle(this);
    }

    public void cancel() {
        this.state = new CancelledState();
        process();
    }
    public void setState(IOrderState state) {
        this.state = state;
    }
    
}