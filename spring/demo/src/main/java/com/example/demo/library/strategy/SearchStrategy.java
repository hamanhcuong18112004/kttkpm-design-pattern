package library.strategy;

import library.factory.Book;
import java.util.List;

// Strategy Interface - Chien luoc tim kiem
public interface SearchStrategy {
    List<Book> search(List<Book> books, String keyword);
    String getStrategyName();
}
