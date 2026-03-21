package order.strategy;

public class NewOrderStrategy implements OrderActionStrategy{
    @Override
    public void execute(String orderId) {
        System.out.println("[" + orderId + "] Moi tao: Kiem tra thong tin don hang");
    }
}
