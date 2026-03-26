package com.example.demo.library.decorator;

// Concrete Decorator - Gia han thoi gian muon
public class ExtendedBorrow extends BorrowDecorator {
    private int extraDays;

    public ExtendedBorrow(BorrowService service, int extraDays) {
        super(service);
        this.extraDays = extraDays;
    }

    @Override
    public String getDescription() {
        return wrappedService.getDescription() + " + Gia han " + extraDays + " ngay";
    }

    @Override
    public int getBorrowDays() {
        return wrappedService.getBorrowDays() + extraDays;
    }

    @Override
    public double getCost() {
        return wrappedService.getCost() + (extraDays * 1000); // 1000 VND/ngay
    }
}
