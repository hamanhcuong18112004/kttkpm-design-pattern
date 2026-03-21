package order.state;

public class DeliveredState implements IOrderState {
    @Override
    public void handle(Order order) {
        System.out.println("[Da giao] Cap nhat trang thai don hang la da giao");
        // Trang thai cuoi: giu nguyen
    }
    @Override
    public void name() {
        System.out.println("Delivered");
    }
  
}
