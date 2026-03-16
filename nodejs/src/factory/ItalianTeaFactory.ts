import DrinkFactory from "./DrinkFactory";
import ItalianCoffee from "./products/ItalianCoffee";
import ItalianTea from "./products/ItalianTea";

class ItalianDrinkFactory extends DrinkFactory {
    createCoffee() {
        return new ItalianCoffee();
    } // Factory Method
    createTea() {
        return new ItalianTea();
    } // Factory Method
}

export default ItalianDrinkFactory;
