package tax.decorator;

public class ExciseDecorator extends TaxDecorator {
    public ExciseDecorator(PriceComponent wrappee) {
        super(wrappee);
    }

    @Override
    public double getPrice() {
        return wrappee.getPrice() * 1.15;
    }

    @Override
    public String description() {
        return wrappee.description() + " + Thue tieu thu(15%)";
    }
}
