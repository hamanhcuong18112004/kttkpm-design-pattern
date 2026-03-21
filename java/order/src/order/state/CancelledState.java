package order.state;

public class CancelledState  implements IOrderState {
 @Override
    public void handle(Order order) {
        System.out.println("[Huy] Huy don hang va hoan tien");
        // Trang thai cuoi: giu nguyen
    }

    @Override
    public void name() {
        System.out.println("Cancelled");
    }
  
}
