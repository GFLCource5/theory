package com.geeksforless.tuleninov.threadpool.homework;

import com.geeksforless.tuleninov.threadpool.homework.config.beans.BeanConfig;
import com.geeksforless.tuleninov.threadpool.homework.config.properties.PropertiesConfig;
import com.geeksforless.tuleninov.threadpool.homework.model.Message;
import com.geeksforless.tuleninov.threadpool.homework.model.ThreadPoolConfig;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

public class Notification {

    public static void main(String[] args) throws InterruptedException {
        List<Message> messagesToSend = new ArrayList<>();
        messagesToSend.add(new Message("Hello"));
        messagesToSend.add(new Message("How are you?"));
        messagesToSend.forEach(message -> System.out.println(message.getMessage()));
        System.out.println("Number of messages to send: " + messagesToSend.size());

        MessageNotificationClient messageNotificationClient = new MessageNotificationClient(getThreadPoolExecutor());
        List<Message> messagesToReceived = messageNotificationClient.send(messagesToSend);
        System.out.println("Number of messages received: " + messagesToReceived.size());

        messageNotificationClient.shutdown();
    }

    private static ThreadPoolExecutor getThreadPoolExecutor() {
        BeanConfig beanConfig = new BeanConfig(new PropertiesConfig());
        ThreadPoolConfig threadPoolConfig = beanConfig.threadPoolConfig();
        return beanConfig.threadPoolExecutor(threadPoolConfig);
    }
}
