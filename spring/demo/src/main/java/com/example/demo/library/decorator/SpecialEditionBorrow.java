package library.decorator;

// Concrete Decorator - Yeu cau phien ban dac biet (sach co chu noi, ban dich)
public class SpecialEditionBorrow extends BorrowDecorator {
    private String editionType; // "Braille", "Large Print"

    public SpecialEditionBorrow(BorrowService service, String editionType) {
        super(service);
        this.editionType = editionType;
    }

    @Override
    public String getDescription() {
        return wrappedService.getDescription() + " + Phien ban: " + editionType;
    }

    @Override
    public double getCost() {
        return wrappedService.getCost() + 5000; // 5000 VND phu phi
    }
}
