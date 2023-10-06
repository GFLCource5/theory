package com.example.validatelist.entity;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public class Book {

    private long  id;

    @NotEmpty
    private String author;

    @NotEmpty
    @Pattern(regexp = "^(?=.*[A-Z]).{3,}$")
    private String name;

    public Book(long id, String author, String name) {
        this.id = id;
        this.author = author;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }
}
