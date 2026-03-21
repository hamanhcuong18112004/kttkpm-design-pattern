package tax.decorator;

public class DecoratorTaxDemo {
    public static void main(String[] args) {
        PriceComponent p1 = new BasePrice(100000);
        p1 = new VatDecorator(p1);
        p1 = new ExciseDecorator(p1);

        System.out.println(p1.description());
        System.out.println("Gia sau thue: " + p1.getPrice());

        PriceComponent p2 = new BasePrice(200000);
        p2 = new VatDecorator(p2);
        p2 = new LuxuryDecorator(p2);

        System.out.println(p2.description());
        System.out.println("Gia sau thue: " + p2.getPrice());
    }
}
