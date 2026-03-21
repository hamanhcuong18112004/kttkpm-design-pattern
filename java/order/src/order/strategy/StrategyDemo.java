package order.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        OrderContext order = new OrderContext("DH003");

        order.setStrategy(new NewOrderStrategy());
        order.run();

        order.setStrategy(new ProcessingOrderStrategy());
        order.run();

        order.setStrategy(new DeliveredOrderStrategy());
        order.run();

        order.setStrategy(new CancelledOrderStrategy());
        order.run();
    }
}