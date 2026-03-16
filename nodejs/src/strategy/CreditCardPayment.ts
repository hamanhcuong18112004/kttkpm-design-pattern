import { PaymentStrategy, PaymentResult } from "./PaymentStrategy";

class CreditCardPayment implements PaymentStrategy {
    private cardNumber: string;
    private feeRate: number = 0.02;

    constructor(cardNumber: string) {
        this.cardNumber = cardNumber;
    }

    getName(): string { return "Thẻ tín dụng"; }

    pay(amount: number): PaymentResult {
        if (!this.cardNumber || this.cardNumber.length !== 16) {
            return { success: false, message: "Số thẻ không hợp lệ" };
        }
        const fee = Math.round(amount * this.feeRate);
        return {
            success: true,
            message: `Thanh toán ${amount.toLocaleString()} VND. Phí: ${fee.toLocaleString()} VND. Tổng: ${(amount + fee).toLocaleString()} VND`,
        };
    }
}

export default CreditCardPayment;
