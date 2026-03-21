package tax.strategy;

public interface TaxStrategy {
    double calculateTax(double basePrice);

    String name();
}
