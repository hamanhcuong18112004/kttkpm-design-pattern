package library.strategy;

import library.factory.Book;
import java.util.ArrayList;
import java.util.List;

// ConcreteStrategy - Tim kiem theo the loai
public class SearchByGenre implements SearchStrategy {

    @Override
    public List<Book> search(List<Book> books, String keyword) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre().toLowerCase().contains(keyword.toLowerCase())) {
                results.add(book);
            }
        }
        return results;
    }

    @Override
    public String getStrategyName() {
        return "Tim kiem theo The loai";
    }
}
