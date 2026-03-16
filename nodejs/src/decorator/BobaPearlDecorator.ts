import BeverageDecorator from "./BeverageDecorator";

class BobaPearlDecorator extends BeverageDecorator {
    getDescription(): string {
        return `${this.beverage.getDescription()} + Trân châu`;
    }
    getCost(): number {
        return this.beverage.getCost() + 12000;
    }
}

export default BobaPearlDecorator;
