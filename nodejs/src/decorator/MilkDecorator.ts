import BeverageDecorator from "./BeverageDecorator";

class MilkDecorator extends BeverageDecorator {
    getDescription(): string {
        return `${this.beverage.getDescription()} + Sữa`;
    }
    getCost(): number {
        return this.beverage.getCost() + 10000;
    }
}

export default MilkDecorator;
