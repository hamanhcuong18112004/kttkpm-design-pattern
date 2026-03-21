package tax.state;

public interface ITax {
    void apply(ProductTaxContext context);
    String name();
}
