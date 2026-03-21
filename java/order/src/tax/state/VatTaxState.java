package tax.state;

public class VatTaxState implements ITax {
    @Override
    public void apply(ProductTaxContext context) {
        double vat = context.getProduct().getBasePrice() * 0.10;
        context.addTax(vat);
        System.out.println("  + VAT (10%): " + vat);
        context.setState(new ExciseTaxState());
    }

    @Override
    public String name() {
        return "Da tinh VAT";
    }
}
