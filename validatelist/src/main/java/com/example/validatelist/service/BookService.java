package com.example.validatelist.service;

import com.example.validatelist.entity.Book;

import java.util.List;

public interface BookService {

    Book createBook(Book book);

    List<Book> createBooks(List<Book> book);

}
