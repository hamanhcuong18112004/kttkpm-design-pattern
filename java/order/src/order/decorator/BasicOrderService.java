package order.decorator;


class BasicOrderService implements OrderService {
    @Override
    public void processNew(String orderId) {
        System.out.println("[" + orderId + "] Moi tao: Kiem tra thong tin don hang");
    }

    @Override
    public void processProcessing(String orderId) {
        System.out.println("[" + orderId + "] Dang xu ly: Dong goi va van chuyen");
    }

    @Override
    public void processDelivered(String orderId) {
        System.out.println("[" + orderId + "] Da giao: Cap nhat trang thai don hang la da giao");
    }

    @Override
    public void processCancelled(String orderId) {
        System.out.println("[" + orderId + "] Huy: Huy don hang va hoan tien");
    }
}
