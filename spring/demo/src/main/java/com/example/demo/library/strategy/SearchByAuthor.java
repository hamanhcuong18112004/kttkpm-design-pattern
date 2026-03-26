package com.example.demo.library.strategy;

import com.example.demo.library.factory.Book;
import java.util.ArrayList;
import java.util.List;

// ConcreteStrategy - Tim kiem theo tac gia
public class SearchByAuthor implements SearchStrategy {

    @Override
    public List<Book> search(List<Book> books, String keyword) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                results.add(book);
            }
        }
        return results;
    }

    @Override
    public String getStrategyName() {
        return "Tim kiem theo Tac gia";
    }
}
