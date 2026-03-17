package com.example.demo.state;

import com.example.demo.model.Order;

public class PreparingState extends OrderState {
    public PreparingState(Order order) {
        super(order);
    }

    @Override
    public String getName() {
        return "PREPARING";
    }

    @Override
    public void next() {
        System.out.println("Đơn #" + order.getId() + ": PREPARING -> READY");
        order.setState(new ReadyState(order));
    }

    @Override
    public void cancel() {
        System.out.println("Đơn #" + order.getId() + ": PREPARING -> CANCELLED");
        order.setState(new CancelledState(order));
    }
}
