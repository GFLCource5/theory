package com.example.validatelist.controllers;

import com.example.validatelist.entity.Book;
import com.example.validatelist.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookRestControllerImpl implements BookRestController {

    private  final  BookService service;

    public BookRestControllerImpl(BookService service) {
        this.service = service;
    }

    @Override
    @PostMapping("/book/")
    public ResponseEntity<Book> addBook(Book book) {
        return ResponseEntity.ok(service.createBook(book));
    }

    @Override
    @PostMapping("/book/")
    public ResponseEntity<List<Book>> addBooks(List books) {
        return ResponseEntity.ok(service.createBooks(books));
    }
}
