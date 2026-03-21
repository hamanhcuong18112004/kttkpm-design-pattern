package order.decorator;

interface OrderService {
    void processNew(String orderId);
    void processProcessing(String orderId);
    void processDelivered(String orderId);
    void processCancelled(String orderId);
}
