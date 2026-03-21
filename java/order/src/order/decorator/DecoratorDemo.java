package order.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        OrderService service = new BasicOrderService();
          service.processNew("1DH004");
        service.processProcessing("1DH004");
        service.processDelivered("1DH004");
        service.processCancelled("1DH005");
        service = new LoggingDecorator(service);
          service.processNew("2DH004");
        service.processProcessing("2DH004");
        service.processDelivered("2DH004");
        service.processCancelled("2DH005");
        service = new NotifyDecorator(service);

        service.processNew("3DH004");
        service.processProcessing("3DH004");
        service.processDelivered("3DH004");
        service.processCancelled("3DH005");
    }
}
