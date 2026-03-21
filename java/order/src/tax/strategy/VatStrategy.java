package tax.strategy;

public class VatStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double basePrice) {
        return basePrice * 0.10;
    }

    @Override
    public String name() {
        return "VAT";
    }
}
