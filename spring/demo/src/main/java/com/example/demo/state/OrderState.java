package com.example.demo.state;

import com.example.demo.decorator.Beverage;
import com.example.demo.model.Order;

public abstract class OrderState {
    protected final Order order;

    protected OrderState(Order order) {
        this.order = order;
    }

    public abstract String getName();

    public abstract void next();

    public abstract void cancel();

    public boolean addItem(Beverage item) {
        System.out.println("Không thể thêm đồ ở trạng thái " + getName());
        return false;
    }
}
