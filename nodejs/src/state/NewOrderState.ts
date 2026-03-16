import OrderState, { IOrder } from "./OrderState";
import PreparingState from "./PreparingState";
import CancelledState from "./CancelledState";

class NewOrderState extends OrderState {
    constructor(order: IOrder) { super(order); }

    getName(): string { return "NEW"; }

    next(): void {
        console.log(`📦 Đơn #${this.order.id}: NEW → PREPARING`);
        this.order.setState(new PreparingState(this.order));
    }

    cancel(): void {
        console.log(`❌ Đơn #${this.order.id}: NEW → CANCELLED`);
        this.order.setState(new CancelledState(this.order));
    }

    addItem(item: { getDescription(): string }): boolean {
        console.log(`✅ Đơn #${this.order.id}: Thêm "${item.getDescription()}" thành công`);
        return true;
    }
}

export default NewOrderState;
