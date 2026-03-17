package com.example.demo.model;

import com.example.demo.decorator.Beverage;
import com.example.demo.state.NewOrderState;
import com.example.demo.state.OrderState;
import com.example.demo.strategy.PaymentResult;
import com.example.demo.strategy.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final String id;
    private final List<Beverage> items = new ArrayList<>();
    private OrderState state;
    private PaymentStrategy paymentStrategy;

    public Order(String id) {
        this.id = id;
        this.state = new NewOrderState(this);
    }

    public String getId() {
        return id;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public String getStateName() {
        return state.getName();
    }

    public void next() {
        state.next();
    }

    public void cancel() {
        state.cancel();
    }

    public void addItem(Beverage beverage) {
        if (state.addItem(beverage)) {
            items.add(beverage);
        }
    }

    public int getTotal() {
        return items.stream().mapToInt(Beverage::getCost).sum();
    }

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public PaymentResult pay() {
        if (paymentStrategy == null) {
            System.out.println("Chưa chọn phương thức thanh toán");
            return null;
        }

        PaymentResult result = paymentStrategy.pay(getTotal());
        System.out.println("[" + paymentStrategy.getName() + "] " + result.getMessage());
        return result;
    }
}
