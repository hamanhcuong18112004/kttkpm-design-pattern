package order.strategy;

class OrderContext {
    private final String orderId;
    private OrderActionStrategy strategy;

    public OrderContext(String orderId) {
        this.orderId = orderId;
    }

    public void setStrategy(OrderActionStrategy strategy) {
        this.strategy = strategy;
    }

    public void run() {
        if (strategy == null) {
            throw new IllegalStateException("Chua chon strategy");
        }
        strategy.execute(orderId);
    }
}