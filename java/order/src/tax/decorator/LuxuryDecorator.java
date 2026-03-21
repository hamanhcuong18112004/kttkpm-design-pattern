package tax.decorator;

public class LuxuryDecorator extends TaxDecorator {
    public LuxuryDecorator(PriceComponent wrappee) {
        super(wrappee);
    }

    @Override
    public double getPrice() {
        return wrappee.getPrice() * 1.20;
    }

    @Override
    public String description() {
        return wrappee.description() + " + Thue xa xi(20%)";
    }
}
