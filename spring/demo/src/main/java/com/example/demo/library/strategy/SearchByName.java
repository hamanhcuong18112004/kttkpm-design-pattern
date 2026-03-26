package library.strategy;

import library.factory.Book;
import java.util.ArrayList;
import java.util.List;

// ConcreteStrategy - Tim kiem theo ten sach
public class SearchByName implements SearchStrategy {

    @Override
    public List<Book> search(List<Book> books, String keyword) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                results.add(book);
            }
        }
        return results;
    }

    @Override
    public String getStrategyName() {
        return "Tim kiem theo Ten";
    }
}
