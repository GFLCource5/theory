package com.geeksforless.tuleninov.threadpool.homework;

import com.geeksforless.tuleninov.threadpool.homework.model.Message;

import java.util.concurrent.Callable;

public class NotificationTask implements Callable<Message> {

    private final Message message;

    public NotificationTask(Message message) {
        this.message = message;
    }

    @Override
    public Message call() {
        return message;
    }
}
