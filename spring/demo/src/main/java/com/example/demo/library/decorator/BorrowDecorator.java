package library.decorator;

// Abstract Decorator
public abstract class BorrowDecorator implements BorrowService {
    protected BorrowService wrappedService;

    public BorrowDecorator(BorrowService service) {
        this.wrappedService = service;
    }

    @Override
    public String getDescription() {
        return wrappedService.getDescription();
    }

    @Override
    public int getBorrowDays() {
        return wrappedService.getBorrowDays();
    }

    @Override
    public double getCost() {
        return wrappedService.getCost();
    }
}
