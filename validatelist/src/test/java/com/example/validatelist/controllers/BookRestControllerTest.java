package com.example.validatelist.controllers;

import com.example.validatelist.entity.Book;
import com.example.validatelist.service.BookService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Answers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(BookRestController.class)
class BookRestControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean(answer = Answers.CALLS_REAL_METHODS)
    private BookService service;

    @Test
    void addValidBook() throws Exception {
        Book book = new Book("author", "Book name");
        when(service.createBook(book)).thenReturn(book);

        this.mockMvc.perform(post("/book")
                        .accept(MediaType.APPLICATION_JSON_VALUE)
                        .content(objectToJson(book)
                        ).contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andExpect(jsonPath("author").value("author"))
                .andExpect(jsonPath("name").value("Book name"));
    }

    @Test
    void addValidBooks() throws Exception {
        Book book = new Book("author", "Book name");
        Book book1 = new Book("author1", "Book name1");
        when(service.createBooks(List.of(book,book1))).thenReturn(List.of(book,book1));

        this.mockMvc.perform(post("/book/many")
                        .accept(MediaType.APPLICATION_JSON_VALUE)
                        .content(objectToJson(new Book[]{book, book1})).contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.author").value("author"))
                .andExpect(jsonPath("$.name").value("Book name"))
                .andExpect(jsonPath("$.author").value("author1"))
                .andExpect(jsonPath("$.name").value("Book name1"));

    }

    @Test
    void addInvalidBook() throws Exception {
        Book book = new Book("author", "Книга");
        when(service.createBook(book)).thenReturn(book);

        this.mockMvc.perform(post("/book")
                        .accept(MediaType.APPLICATION_JSON_VALUE)
                        .content(objectToJson(book)
                        ).contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().is4xxClientError());
    }

    @Test
    void addInvalidBooks() throws Exception {
        Book book = new Book("author", "книга");
        Book book1 = new Book("author1", "Book name1");
        when(service.createBooks(List.of(book,book1))).thenReturn(List.of(book,book1));

        this.mockMvc.perform(post("/book/many")
                        .accept(MediaType.APPLICATION_JSON_VALUE)
                        .content(objectToJson(new Book[]{book, book1})
                        ).contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().is5xxServerError());
    }


    private static String objectToJson(Object object) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(object);
    }
}