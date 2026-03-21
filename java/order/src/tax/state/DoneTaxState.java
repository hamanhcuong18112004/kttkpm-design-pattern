package tax.state;

public class DoneTaxState implements ITax {
    @Override
    public void apply(ProductTaxContext context) {
        double finalPrice = context.getProduct().getBasePrice() + context.getTotalTax();
        System.out.println("Tong thue: " + context.getTotalTax());
        System.out.println("Gia sau thue: " + finalPrice);
    }

    @Override
    public String name() {
        return "Hoan tat";
    }
}
