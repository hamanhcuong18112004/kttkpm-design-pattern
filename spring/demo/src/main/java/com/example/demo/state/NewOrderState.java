package com.example.demo.state;

import com.example.demo.decorator.Beverage;
import com.example.demo.model.Order;

public class NewOrderState extends OrderState {
    public NewOrderState(Order order) {
        super(order);
    }

    @Override
    public String getName() {
        return "NEW";
    }

    @Override
    public void next() {
        System.out.println("Đơn #" + order.getId() + ": NEW -> PREPARING");
        order.setState(new PreparingState(order));
    }

    @Override
    public void cancel() {
        System.out.println("Đơn #" + order.getId() + ": NEW -> CANCELLED");
        order.setState(new CancelledState(order));
    }

    @Override
    public boolean addItem(Beverage item) {
        System.out.println("Đơn #" + order.getId() + ": Thêm \"" + item.getDescription() + "\" thành công");
        return true;
    }
}
