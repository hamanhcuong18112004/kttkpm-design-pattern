import { Beverage } from "./decorator/BeverageDecorator";
import MilkDecorator from "./decorator/MilkDecorator";
import SugarDecorator from "./decorator/SugarDecorator";
import WhipCreamDecorator from "./decorator/WhipCreamDecorator";
import BobaPearlDecorator from "./decorator/BobaPearlDecorator";
import Order from "./models/Order";
import CashPayment from "./strategy/CashPayment";
import CreditCardPayment from "./strategy/CreditCardPayment";
import EWalletPayment from "./strategy/EWalletPayment";

// ─── Sản phẩm cơ bản ────────────────────────────────────────────────
class VietnameseCoffee implements Beverage {
    getDescription(): string { return "Cà phê sữa đá"; }
    getCost(): number { return 35000; }
}

class VietnameseTea implements Beverage {
    getDescription(): string { return "Trà đá"; }
    getCost(): number { return 15000; }
}

// ─── DECORATOR DEMO ──────────────────────────────────────────────────
console.log("=== DECORATOR PATTERN — Thêm topping ===\n");

let drink: Beverage = new VietnameseCoffee();
console.log(`[Base]       ${drink.getDescription()} — ${drink.getCost().toLocaleString()} VND`);

drink = new MilkDecorator(drink);
console.log(`[+Sữa]       ${drink.getDescription()} — ${drink.getCost().toLocaleString()} VND`);

drink = new SugarDecorator(drink);
console.log(`[+Đường]     ${drink.getDescription()} — ${drink.getCost().toLocaleString()} VND`);

drink = new BobaPearlDecorator(drink);
console.log(`[+Trân châu] ${drink.getDescription()} — ${drink.getCost().toLocaleString()} VND`);

drink = new WhipCreamDecorator(drink);
console.log(`[+Kem tươi]  ${drink.getDescription()} — ${drink.getCost().toLocaleString()} VND`);

// ─── STATE DEMO ──────────────────────────────────────────────────────
console.log("\n=== STATE PATTERN — Vòng đời đơn hàng ===\n");

const order1 = new Order("001");
console.log(`[Trạng thái] ${order1.getStateName()}`);

order1.addItem(drink);
order1.addItem(new VietnameseTea());
order1.next();                                   // NEW → PREPARING
order1.addItem(new VietnameseCoffee());          // ❌ PREPARING
order1.next();                                   // PREPARING → READY
order1.cancel();                                 // ⚠️ READY không huỷ
order1.next();                                   // READY → DELIVERED
order1.next();                                   // ⚠️ DELIVERED

console.log(`\n--- Demo huỷ đơn ---`);
const order2 = new Order("002");
order2.addItem(new VietnameseCoffee());
order2.cancel();                                 // NEW → CANCELLED
order2.next();                                   // ⚠️ CANCELLED

// ─── STRATEGY DEMO ───────────────────────────────────────────────────
console.log("\n=== STRATEGY PATTERN — Thanh toán ===\n");

const order3 = new Order("003");
order3.addItem(drink);
console.log(`Tổng đơn 003: ${order3.getTotal().toLocaleString()} VND\n`);

// Tiền mặt
order3.setPaymentStrategy(new CashPayment(100000));
order3.pay();

// Thẻ tín dụng
order3.setPaymentStrategy(new CreditCardPayment("1234567890123456"));
order3.pay();

// Ví điện tử
order3.setPaymentStrategy(new EWalletPayment("MoMo", 1000000));
order3.pay();

// Thiếu tiền
console.log("\n--- Demo thất bại ---");
order3.setPaymentStrategy(new CashPayment(10000));
order3.pay();

order3.setPaymentStrategy(new CreditCardPayment("123"));
order3.pay();

order3.setPaymentStrategy(new EWalletPayment("ZaloPay", 5000));
order3.pay();
