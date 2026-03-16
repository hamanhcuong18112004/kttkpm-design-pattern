import OrderState, { IOrder } from "./OrderState";
import DeliveredState from "./DeliveredState";

class ReadyState extends OrderState {
    constructor(order: IOrder) { super(order); }

    getName(): string { return "READY"; }

    next(): void {
        console.log(`🚀 Đơn #${this.order.id}: READY → DELIVERED`);
        this.order.setState(new DeliveredState(this.order));
    }

    cancel(): void {
        console.log(`⚠️ Đơn #${this.order.id}: Không thể huỷ khi đã READY`);
    }
}

export default ReadyState;
