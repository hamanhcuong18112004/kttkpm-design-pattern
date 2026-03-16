import OrderState, { IOrder } from "./OrderState";
import ReadyState from "./ReadyState";
import CancelledState from "./CancelledState";

class PreparingState extends OrderState {
    constructor(order: IOrder) { super(order); }

    getName(): string { return "PREPARING"; }

    next(): void {
        console.log(`🍵 Đơn #${this.order.id}: PREPARING → READY`);
        this.order.setState(new ReadyState(this.order));
    }

    cancel(): void {
        console.log(`❌ Đơn #${this.order.id}: PREPARING → CANCELLED`);
        this.order.setState(new CancelledState(this.order));
    }
}

export default PreparingState;
