import BeverageDecorator from "./BeverageDecorator";

class SugarDecorator extends BeverageDecorator {
    getDescription(): string {
        return `${this.beverage.getDescription()} + Đường`;
    }
    getCost(): number {
        return this.beverage.getCost() + 5000;
    }
}

export default SugarDecorator;
