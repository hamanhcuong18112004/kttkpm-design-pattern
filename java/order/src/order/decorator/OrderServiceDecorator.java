package order.decorator;

abstract class OrderServiceDecorator implements OrderService {
    protected final OrderService wrappee;

    protected OrderServiceDecorator(OrderService wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void processNew(String orderId) {
        wrappee.processNew(orderId);
    }

    @Override
    public void processProcessing(String orderId) {
        wrappee.processProcessing(orderId);
    }

    @Override
    public void processDelivered(String orderId) {
        wrappee.processDelivered(orderId);
    }

    @Override
    public void processCancelled(String orderId) {
        wrappee.processCancelled(orderId);
    }
}
