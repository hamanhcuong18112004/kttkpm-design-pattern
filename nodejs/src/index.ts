import { Beverage } from "./decorator/BeverageDecorator";
import MilkDecorator from "./decorator/MilkDecorator";
import SugarDecorator from "./decorator/SugarDecorator";
import WhipCreamDecorator from "./decorator/WhipCreamDecorator";
import BobaPearlDecorator from "./decorator/BobaPearlDecorator";

// Sản phẩm cơ bản (plain object implement Beverage)
class VietnameseCoffee implements Beverage {
    getDescription(): string { return "Cà phê sữa đá"; }
    getCost(): number { return 35000; }
}

// ─── DEMO ─────────────────────────────────────────────────────────────
console.log("=== DECORATOR PATTERN — Quán cà phê ===\n");

let drink: Beverage = new VietnameseCoffee();
console.log(`[Base]        ${drink.getDescription()} — ${drink.getCost().toLocaleString()} VND`);

drink = new MilkDecorator(drink);
console.log(`[+Sữa]        ${drink.getDescription()} — ${drink.getCost().toLocaleString()} VND`);

drink = new SugarDecorator(drink);
console.log(`[+Đường]      ${drink.getDescription()} — ${drink.getCost().toLocaleString()} VND`);

drink = new BobaPearlDecorator(drink);
console.log(`[+Trân châu]  ${drink.getDescription()} — ${drink.getCost().toLocaleString()} VND`);

drink = new WhipCreamDecorator(drink);
console.log(`[+Kem tươi]   ${drink.getDescription()} — ${drink.getCost().toLocaleString()} VND`);

console.log("\n✅ Tổng cộng:", drink.getCost().toLocaleString(), "VND");
