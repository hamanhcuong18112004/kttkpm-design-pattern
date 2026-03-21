package order.decorator;

class LoggingDecorator extends OrderServiceDecorator {
    public LoggingDecorator(OrderService wrappee) {
        super(wrappee);
    }

    @Override
    public void processNew(String orderId) {
        System.out.println("[LOG] Bat dau xu ly Moi tao");
        super.processNew(orderId);
    }

    @Override
    public void processCancelled(String orderId) {
        System.out.println("[LOG] Bat dau xu ly Huy don");
        super.processCancelled(orderId);
    }
}
