class ItalianTea {
    brew() {
        return "Pha trà kiểu Ý";
    }
    getPrice() {
        return 40000;
    }
    getDescription() {
        return "Trà Ý";
    }
    getCost() {
        return this.getPrice();
    }
}

export default ItalianTea;
