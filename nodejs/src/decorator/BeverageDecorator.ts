export interface Beverage {
    getDescription(): string;
    getCost(): number;
}

class BeverageDecorator implements Beverage {
    protected beverage: Beverage;
    constructor(beverage: Beverage) {
        this.beverage = beverage;
    }
    getDescription(): string {
        return this.beverage.getDescription();
    }
    getCost(): number {
        return this.beverage.getCost();
    }
}
export default BeverageDecorator;
