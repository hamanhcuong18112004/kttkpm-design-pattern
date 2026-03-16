class DrinkFactory {
    createCoffee() {
        throw new Error("Subclass phải implement createCoffee()");
    }
    createTea() {
        throw new Error("Subclass phải implement createTea()");
    }
}

export default DrinkFactory;
