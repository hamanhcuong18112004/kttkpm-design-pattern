package library.decorator;

// Concrete Component - Muon sach co ban
public class BasicBorrow implements BorrowService {
    private String bookTitle;

    public BasicBorrow(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public String getDescription() {
        return "Muon sach \"" + bookTitle + "\"";
    }

    @Override
    public int getBorrowDays() {
        return 14; // 14 ngay mac dinh
    }

    @Override
    public double getCost() {
        return 0; // Mien phi
    }
}
