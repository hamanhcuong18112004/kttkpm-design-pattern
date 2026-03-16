export interface PaymentResult {
    success: boolean;
    message: string;
}

export interface PaymentStrategy {
    getName(): string;
    pay(amount: number): PaymentResult;
}
