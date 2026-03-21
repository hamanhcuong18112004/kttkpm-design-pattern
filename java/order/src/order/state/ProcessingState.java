package order.state;

public class ProcessingState implements IOrderState {
   @Override
    public void handle(Order order) {
        System.out.println("[Dang xu ly] Dong goi va van chuyen");
        order.setState(new DeliveredState());
    }

    @Override
    public void name() {
        System.out.println("Processing");
    }
  
}
