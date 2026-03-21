package tax.decorator;

public abstract class TaxDecorator implements PriceComponent {
    protected final PriceComponent wrappee;

    protected TaxDecorator(PriceComponent wrappee) {
        this.wrappee = wrappee;
    }
}
