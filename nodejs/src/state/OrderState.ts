// Interface tối giản để tránh circular dependency với Order
export interface IOrder {
    id: string;
    setState(state: OrderState): void;
}

abstract class OrderState {
    protected order: IOrder;

    constructor(order: IOrder) {
        this.order = order;
    }

    abstract getName(): string;
    abstract next(): void;
    abstract cancel(): void;

    addItem(item: { getDescription(): string }): boolean {
        console.log(`❌ Không thể thêm đồ ở trạng thái ${this.getName()}`);
        return false;
    }
}

export default OrderState;
