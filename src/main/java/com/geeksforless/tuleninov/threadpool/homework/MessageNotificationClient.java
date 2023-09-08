package com.geeksforless.tuleninov.threadpool.homework;

import com.geeksforless.tuleninov.threadpool.homework.model.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MessageNotificationClient implements NotificationClient {

    private final ExecutorService threadPool;

    public MessageNotificationClient(ExecutorService threadPool) {
        this.threadPool = threadPool;
    }

    @Override
    public List<Message> send(List<Message> messages) {
        int count = messages.size();

        List<Future<?>> tasks = new ArrayList<>(count);
        for (Message message : messages) {
            Future<?> future = threadPool.submit(new NotificationTask(message));
            tasks.add(future);
        }

        List<Message> objects = new ArrayList<>(count);
        for (Future<?> task : tasks) {
            try {
                objects.add((Message) task.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        return objects;
    }

    @Override
    public void shutdown() {
        threadPool.shutdown();
    }
}
