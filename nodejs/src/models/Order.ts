import { Beverage } from "../decorator/BeverageDecorator";
import OrderState, { IOrder } from "../state/OrderState";
import NewOrderState from "../state/NewOrderState";
import { PaymentStrategy } from "../strategy/PaymentStrategy";

class Order implements IOrder {
    id: string;
    items: Beverage[];
    private state: OrderState;
    private paymentStrategy: PaymentStrategy | null;

    constructor(id: string) {
        this.id = id;
        this.items = [];
        this.paymentStrategy = null;
        this.state = new NewOrderState(this);
    }

    setState(state: OrderState): void {
        this.state = state;
    }

    getStateName(): string {
        return this.state.getName();
    }

    next(): void {
        this.state.next();
    }

    cancel(): void {
        this.state.cancel();
    }

    addItem(beverage: Beverage): void {
        if (this.state.addItem(beverage)) {
            this.items.push(beverage);
        }
    }

    getTotal(): number {
        return this.items.reduce((sum, item) => sum + item.getCost(), 0);
    }

    setPaymentStrategy(strategy: PaymentStrategy): void {
        this.paymentStrategy = strategy;
    }

    pay(): void {
        if (!this.paymentStrategy) {
            console.log("⚠️ Chưa chọn phương thức thanh toán");
            return;
        }
        const result = this.paymentStrategy.pay(this.getTotal());
        console.log(`[${this.paymentStrategy.getName()}] ${result.message}`);
    }
}

export default Order;
