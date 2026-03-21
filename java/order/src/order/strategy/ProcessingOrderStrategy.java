package order.strategy;

class ProcessingOrderStrategy implements OrderActionStrategy {
    @Override
    public void execute(String orderId) {
        System.out.println("[" + orderId + "] Dang xu ly: Dong goi va van chuyen");
    }
}