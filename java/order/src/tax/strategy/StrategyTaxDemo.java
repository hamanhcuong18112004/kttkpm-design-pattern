package tax.strategy;

public class StrategyTaxDemo {
    public static void main(String[] args) {
        double basePrice = 100000;
        TaxCalculator calculator = new TaxCalculator();

        calculator.setStrategy(new VatStrategy());
        double vat = calculator.execute(basePrice);

        calculator.setStrategy(new ExciseStrategy());
        double excise = calculator.execute(basePrice);

        double total = basePrice + vat + excise;
        System.out.println("Gia sau thue: " + total);
    }
}
