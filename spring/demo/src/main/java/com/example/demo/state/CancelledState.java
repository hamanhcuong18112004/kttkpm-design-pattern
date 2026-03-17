package com.example.demo.state;

import com.example.demo.model.Order;

public class CancelledState extends OrderState {
    public CancelledState(Order order) {
        super(order);
    }

    @Override
    public String getName() {
        return "CANCELLED";
    }

    @Override
    public void next() {
        System.out.println("Đơn #" + order.getId() + ": Đơn đã hủy, không thể chuyển tiếp");
    }

    @Override
    public void cancel() {
        System.out.println("Đơn #" + order.getId() + ": Đơn đã hủy trước đó");
    }
}
