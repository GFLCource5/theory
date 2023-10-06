package com.example.validatelist.service;

import com.example.validatelist.entity.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookRestControllerImpl implements BookRestController {

    private final List<Book> books = new ArrayList<>();

    @Override
    public Book createBook(Book book) {
        book.setId(getNextId());
        books.add(book);
        return book;
    }

    private long getNextId() {
        long l = books.stream().mapToLong(Book::getId).max().orElse(0L);
        return ++l;
    }

    /*@Override
    public Book findById(long id) {
        return books.stream().filter(s -> s.getId() == id).findAny().get();
    }
     */

    @Override
    public List<Book> createBooks(List<Book> newBooks) {
        newBooks.forEach(this::createBook);
        return newBooks;
    }
}
