package payment.decorator;

import payment.strategy.PayPalStrategy;
import payment.strategy.PaymentStrategy;

public class DecoratorPaymentDemo {
    public static void main(String[] args) {
        PaymentComponent payment = new BasePayment(200000);
        payment = new ProcessingFeeDecorator(payment, 10000);
        payment = new DiscountCodeDecorator(payment, 15000);

        System.out.println(payment.description());
        System.out.println("So tien cuoi can thanh toan: " + payment.finalAmount());

        PaymentStrategy method = new PayPalStrategy();
        method.pay("DH103", payment.finalAmount());
    }
}
