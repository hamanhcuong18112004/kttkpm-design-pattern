import { PaymentStrategy, PaymentResult } from "./PaymentStrategy";

class EWalletPayment implements PaymentStrategy {
    private walletName: string;
    private balance: number;

    constructor(walletName: string, balance: number) {
        this.walletName = walletName;
        this.balance = balance;
    }

    getName(): string { return `Ví ${this.walletName}`; }

    pay(amount: number): PaymentResult {
        if (this.balance < amount) {
            return { success: false, message: "Số dư không đủ" };
        }
        this.balance -= amount;
        return {
            success: true,
            message: `Thanh toán ${amount.toLocaleString()} VND. Số dư còn: ${this.balance.toLocaleString()} VND`,
        };
    }
}

export default EWalletPayment;
