package tax.state;

public class ExciseTaxState implements ITax {
    @Override
    public void apply(ProductTaxContext context) {
        if (context.getProduct().isExcise()) {
            double excise = context.getProduct().getBasePrice() * 0.15;
            context.addTax(excise);
            System.out.println("  + Thue tieu thu (15%): " + excise);
        } else {
            System.out.println("  + Khong ap dung thue tieu thu");
        }
        context.setState(new LuxuryTaxState());
    }

    @Override
    public String name() {
        return "Da tinh thue tieu thu";
    }
}
