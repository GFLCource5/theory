package com.example.threadpool;

import java.util.concurrent.BlockingQueue;

public class TaskConsumer implements Runnable{
    private final BlockingQueue<Task> taskQueue;

    public TaskConsumer(BlockingQueue<Task> taskQueue) {
        this.taskQueue = taskQueue;
    }

    @Override
    public void run() {
        try {
            while (!taskQueue.isEmpty()) {
                Task task = taskQueue.take();
                task.execute();
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
