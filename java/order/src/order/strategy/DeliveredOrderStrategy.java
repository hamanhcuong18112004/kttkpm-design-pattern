package order.strategy;


class DeliveredOrderStrategy implements OrderActionStrategy {
    @Override
    public void execute(String orderId) {
        System.out.println("[" + orderId + "] Da giao: Cap nhat trang thai don hang la da giao");
    }
}