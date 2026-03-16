import BeverageDecorator from "./BeverageDecorator";

class WhipCreamDecorator extends BeverageDecorator {
    getDescription(): string {
        return `${this.beverage.getDescription()} + Kem tươi`;
    }
    getCost(): number {
        return this.beverage.getCost() + 15000;
    }
}

export default WhipCreamDecorator;
