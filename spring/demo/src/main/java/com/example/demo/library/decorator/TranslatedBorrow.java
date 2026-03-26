package library.decorator;

// Concrete Decorator - Sach co ban dich
public class TranslatedBorrow extends BorrowDecorator {
    private String language;

    public TranslatedBorrow(BorrowService service, String language) {
        super(service);
        this.language = language;
    }

    @Override
    public String getDescription() {
        return wrappedService.getDescription() + " + Ban dich: " + language;
    }

    @Override
    public double getCost() {
        return wrappedService.getCost() + 3000; // 3000 VND phu phi ban dich
    }
}
