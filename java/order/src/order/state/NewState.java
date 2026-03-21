package order.state;

public class NewState implements IOrderState {
    @Override
     public void handle(Order order) {
        System.out.println("[Moi tao] Kiem tra thong tin don hang");
        order.setState(new ProcessingState());
    }

    @Override
    public void name() {
        System.out.println("New");
    }
}
