class ItalianCoffee {
    prepare() {
        return "Pha Espresso kiểu Ý";
    }
    getPrice() {
        return 55000;
    }
    getDescription() {
        return "Espresso";
    }
    getCost() {
        return this.getPrice();
    }
}

export default ItalianCoffee;
