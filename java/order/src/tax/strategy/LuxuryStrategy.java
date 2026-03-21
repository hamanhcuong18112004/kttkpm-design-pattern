package tax.strategy;

public class LuxuryStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double basePrice) {
        return basePrice * 0.20;
    }

    @Override
    public String name() {
        return "Thue xa xi";
    }
}
