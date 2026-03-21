package order.decorator;

class NotifyDecorator extends OrderServiceDecorator {
    public NotifyDecorator(OrderService wrappee) {
        super(wrappee);
    }

    @Override
    public void processDelivered(String orderId) {
        super.processDelivered(orderId);
        System.out.println("[Notify] Gui thong bao: Don da duoc giao");
    }
}
