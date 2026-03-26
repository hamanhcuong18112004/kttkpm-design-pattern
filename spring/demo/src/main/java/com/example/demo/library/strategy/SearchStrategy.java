package com.example.demo.library.strategy;

import com.example.demo.library.factory.Book;
import java.util.List;

// Strategy Interface - Chien luoc tim kiem
public interface SearchStrategy {
    List<Book> search(List<Book> books, String keyword);
    String getStrategyName();
}
