package com.geeksforless.tuleninov.threadpool.homework;

import com.geeksforless.tuleninov.threadpool.homework.model.Message;

import java.util.List;

interface NotificationClient {

    List<Message> send(List<Message> messages);

    void shutdown();

}
