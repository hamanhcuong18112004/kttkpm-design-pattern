package tax.state;

public class ProductTaxContext {
    private final Product product;
    private ITax state;
    private double totalTax;

    public ProductTaxContext(Product product) {
        this.product = product;
        this.state = new InitTaxState();
        this.totalTax = 0;
    }

    public void next() {
        System.out.println("State: " + state.name());
        state.apply(this);
    }

    public Product getProduct() {
        return product;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public void addTax(double tax) {
        this.totalTax += tax;
    }

    public void setState(ITax state) {
        this.state = state;
    }
}
