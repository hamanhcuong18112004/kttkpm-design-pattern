import { PaymentStrategy, PaymentResult } from "./PaymentStrategy";

class CashPayment implements PaymentStrategy {
    private cashGiven: number;

    constructor(cashGiven: number) {
        this.cashGiven = cashGiven;
    }

    getName(): string { return "Tiền mặt"; }

    pay(amount: number): PaymentResult {
        if (this.cashGiven < amount) {
            return { success: false, message: `Thiếu ${(amount - this.cashGiven).toLocaleString()} VND` };
        }
        return {
            success: true,
            message: `Thanh toán ${amount.toLocaleString()} VND. Tiền thừa: ${(this.cashGiven - amount).toLocaleString()} VND`,
        };
    }
}

export default CashPayment;
