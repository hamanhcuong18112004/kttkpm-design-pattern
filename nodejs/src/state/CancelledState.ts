import OrderState, { IOrder } from "./OrderState";

class CancelledState extends OrderState {
    constructor(order: IOrder) { super(order); }

    getName(): string { return "CANCELLED"; }

    next(): void {
        console.log(`⚠️ Đơn #${this.order.id}: Đã huỷ rồi, không thể tiến thêm`);
    }

    cancel(): void {
        console.log(`⚠️ Đơn #${this.order.id}: Đã huỷ rồi rồi`);
    }
}

export default CancelledState;
