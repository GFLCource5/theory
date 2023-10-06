package com.example.validatelist.controllers;

import com.example.validatelist.entity.Book;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BookRestController<T extends Book> {

    ResponseEntity<Book> addBook(Book book);

    ResponseEntity<List<Book>> addBooks(List<Book> books);

}
