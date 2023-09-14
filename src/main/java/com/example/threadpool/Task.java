package com.example.threadpool;

public class Task {
    private final int id;

    public Task(int id) {
        this.id = id;
    }

    public void execute() {
        System.out.println("Task " + id + " executed by thread: " + Thread.currentThread().getName());
    }
}
