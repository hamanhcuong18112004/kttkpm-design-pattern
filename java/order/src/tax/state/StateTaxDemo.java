package tax.state;

public class StateTaxDemo {
    public static void main(String[] args) {
        Product p = new Product("Nuoc ngot", 100000, true, false);
        ProductTaxContext context = new ProductTaxContext(p);

        context.next();
        context.next();
        context.next();
        context.next();
        context.next();
    }
}
