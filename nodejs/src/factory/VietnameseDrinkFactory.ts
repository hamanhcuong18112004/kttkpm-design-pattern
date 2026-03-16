import DrinkFactory from "./DrinkFactory";
import VietnameseCoffee from "./products/VietnameseCoffee";
import VietnameseTea from "./products/VietnameseTes";

class VietnameseDrinkFactory extends DrinkFactory {
    createCoffee() {
        return new VietnameseCoffee();
    } // Factory Method
    createTea() {
        return new VietnameseTea();
    } // Factory Method
}

export default VietnameseDrinkFactory;
