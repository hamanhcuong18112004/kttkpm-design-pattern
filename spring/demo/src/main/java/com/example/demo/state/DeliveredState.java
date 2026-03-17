package com.example.demo.state;

import com.example.demo.model.Order;

public class DeliveredState extends OrderState {
    public DeliveredState(Order order) {
        super(order);
    }

    @Override
    public String getName() {
        return "DELIVERED";
    }

    @Override
    public void next() {
        System.out.println("Đơn #" + order.getId() + ": Đơn đã giao xong");
    }

    @Override
    public void cancel() {
        System.out.println("Đơn #" + order.getId() + ": Không thể hủy khi đã giao");
    }
}
