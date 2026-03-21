package tax.state;

public class Product {
    private final String name;
    private final double basePrice;
    private final boolean excise;
    private final boolean luxury;

    public Product(String name, double basePrice, boolean excise, boolean luxury) {
        this.name = name;
        this.basePrice = basePrice;
        this.excise = excise;
        this.luxury = luxury;
    }

    public String getName() { return name; }
    public double getBasePrice() { return basePrice; }
    public boolean isExcise() { return excise; }
    public boolean isLuxury() { return luxury; }
}