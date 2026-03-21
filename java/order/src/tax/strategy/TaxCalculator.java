package tax.strategy;

public class TaxCalculator {
    private TaxStrategy strategy;

    public void setStrategy(TaxStrategy strategy) {
        this.strategy = strategy;
    }

    public double execute(double basePrice) {
        if (strategy == null) {
            throw new IllegalStateException("Chua set strategy");
        }
        double tax = strategy.calculateTax(basePrice);
        System.out.println(strategy.name() + ": " + tax);
        return tax;
    }
}
