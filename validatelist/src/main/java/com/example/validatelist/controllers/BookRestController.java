package com.example.validatelist.controllers;

import com.example.validatelist.entity.Book;
import com.example.validatelist.service.BookService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Validated
public class BookRestController {

    private  final  BookService service;

    public BookRestController(BookService service) {
        this.service = service;
    }

    @PostMapping("/book/")
    public ResponseEntity<Book> addBook(@RequestBody @Valid Book book) {
        return ResponseEntity.ok(service.createBook(book));
    }

    @PostMapping("/book/many/")
    public ResponseEntity<List<Book>> addBooks(@RequestBody List<@Valid Book> books) {
        return ResponseEntity.ok(service.createBooks(books));
    }
}
