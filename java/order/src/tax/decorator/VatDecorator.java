package tax.decorator;

public class VatDecorator extends TaxDecorator {
    public VatDecorator(PriceComponent wrappee) {
        super(wrappee);
    }

    @Override
    public double getPrice() {
        return wrappee.getPrice() * 1.10;
    }

    @Override
    public String description() {
        return wrappee.description() + " + VAT(10%)";
    }
}
