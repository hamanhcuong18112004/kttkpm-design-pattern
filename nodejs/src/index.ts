import { Beverage } from "./decorator/BeverageDecorator";
import MilkDecorator from "./decorator/MilkDecorator";
import SugarDecorator from "./decorator/SugarDecorator";
import WhipCreamDecorator from "./decorator/WhipCreamDecorator";
import BobaPearlDecorator from "./decorator/BobaPearlDecorator";
import Order from "./models/Order";

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

order1.addItem(drink);                          // ✅ NEW → cho thêm item
order1.addItem(new VietnameseTea());             // ✅
order1.next();                                   // NEW → PREPARING

order1.addItem(new VietnameseCoffee());          // ❌ PREPARING → không thêm được
order1.next();                                   // PREPARING → READY
order1.cancel();                                 // ⚠️ READY không huỷ được
order1.next();                                   // READY → DELIVERED
order1.next();                                   // ⚠️ DELIVERED → không đi tiếp
order1.cancel();                                 // ⚠️ DELIVERED → không huỷ

console.log(`\n--- Demo huỷ đơn ---`);
const order2 = new Order("002");
order2.addItem(new VietnameseCoffee());
console.log(`[Trạng thái] ${order2.getStateName()}`);
order2.cancel();                                 // NEW → CANCELLED
console.log(`[Trạng thái] ${order2.getStateName()}`);
order2.next();                                   // ⚠️ CANCELLED → không đi tiếp

console.log(`\n✅ Tổng tiền đơn 001: ${order1.getTotal().toLocaleString()} VND`);
