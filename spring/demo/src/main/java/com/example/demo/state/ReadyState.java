package com.example.demo.state;

import com.example.demo.model.Order;

public class ReadyState extends OrderState {
    public ReadyState(Order order) {
        super(order);
    }

    @Override
    public String getName() {
        return "READY";
    }

    @Override
    public void next() {
        System.out.println("Đơn #" + order.getId() + ": READY -> DELIVERED");
        order.setState(new DeliveredState(order));
    }

    @Override
    public void cancel() {
        System.out.println("Đơn #" + order.getId() + ": Không thể hủy khi đã READY");
    }
}
