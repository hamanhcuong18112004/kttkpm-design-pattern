package library.strategy;

import library.factory.Book;
import java.util.List;

// Context - Su dung Strategy de tim kiem
public class BookSearcher {
    private SearchStrategy strategy;

    public BookSearcher(SearchStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SearchStrategy strategy) {
        this.strategy = strategy;
    }

    public SearchStrategy getStrategy() {
        return strategy;
    }

    public List<Book> performSearch(List<Book> books, String keyword) {
        System.out.println("  [" + strategy.getStrategyName() + "] Tu khoa: \"" + keyword + "\"");
        List<Book> results = strategy.search(books, keyword);
        if (results.isEmpty()) {
            System.out.println("  Khong tim thay ket qua.");
        } else {
            System.out.println("  Tim thay " + results.size() + " ket qua:");
            for (Book book : results) {
                System.out.println("    - " + book);
            }
        }
        return results;
    }
}
