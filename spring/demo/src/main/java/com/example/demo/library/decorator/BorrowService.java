package library.decorator;

// Component Interface - Dich vu muon sach
public interface BorrowService {
    String getDescription();
    int getBorrowDays();
    double getCost();
}
