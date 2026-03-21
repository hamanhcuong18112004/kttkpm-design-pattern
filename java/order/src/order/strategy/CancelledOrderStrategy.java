package order.strategy;

class CancelledOrderStrategy implements OrderActionStrategy {
    @Override
    public void execute(String orderId) {
        System.out.println("[" + orderId + "] Huy: Huy don hang va hoan tien");
    }
}
