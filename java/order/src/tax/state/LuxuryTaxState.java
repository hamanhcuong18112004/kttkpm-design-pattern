package tax.state;

public class LuxuryTaxState implements ITax {
    @Override
    public void apply(ProductTaxContext context) {
        if (context.getProduct().isLuxury()) {
            double luxury = context.getProduct().getBasePrice() * 0.20;
            context.addTax(luxury);
            System.out.println("  + Thue xa xi (20%): " + luxury);
        } else {
            System.out.println("  + Khong ap dung thue xa xi");
        }
        context.setState(new DoneTaxState());
    }

    @Override
    public String name() {
        return "Da tinh thue xa xi";
    }
}
