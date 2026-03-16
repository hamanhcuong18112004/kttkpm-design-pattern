import OrderState, { IOrder } from "./OrderState";

class DeliveredState extends OrderState {
    constructor(order: IOrder) { super(order); }

    getName(): string { return "DELIVERED"; }

    next(): void {
        console.log(`⚠️ Đơn #${this.order.id}: Đã giao rồi, không thể tiến thêm`);
    }

    cancel(): void {
        console.log(`⚠️ Đơn #${this.order.id}: Đã giao rồi, không thể huỷ`);
    }
}

export default DeliveredState;
