package tax.strategy;

public class ExciseStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double basePrice) {
        return basePrice * 0.15;
    }

    @Override
    public String name() {
        return "Thue tieu thu";
    }
}
