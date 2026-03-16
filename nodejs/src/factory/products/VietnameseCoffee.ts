class VietnameseCoffee {
    prepare() {
        return "Pha cà phê sữa đá kiểu VN";
    }
    getPrice() {
        return 35000;
    }
    getDescription() {
        return "Cà phê sữa đá";
    }
    getCost() {
        return this.getPrice();
    }
}

export default VietnameseCoffee;
