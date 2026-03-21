package tax.state;

public class InitTaxState implements ITax {
    @Override
    public void apply(ProductTaxContext context) {
        context.setState(new VatTaxState());
    }

    @Override
    public String name() {
        return "Chua tinh thue";
    }
}
