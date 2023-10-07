package com.example.validatelist.controllers;

import com.example.validatelist.entity.Book;
import com.example.validatelist.service.BookService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(BookService.class)
class BookRestControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService service;

    @Test
    void addValidBook() throws Exception {
        Book book = new Book("author", "Book name");
        when(service.createBook(book)).thenReturn(book);

        mockMvc.perform(post("/book").contentType(MediaType.APPLICATION_JSON_VALUE)
                .accept(MediaType.APPLICATION_JSON_VALUE)
                        .content(objectToJson(book)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.author").value("author"))
                .andExpect(jsonPath("$.name").value("Book name"));

    }

    @Test
    void addValidBooks() {
    }

    @Test
    void addInvalidBook() {
    }

    @Test
    void addInvalidBooks() {
    }


    private static String objectToJson(Object object) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(object);
    }
}