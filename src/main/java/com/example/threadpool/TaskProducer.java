package com.example.threadpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class TaskProducer implements Runnable{
    private final BlockingQueue<Task> taskQueue;
    private final int numberOfTasks = 100;

    public TaskProducer(BlockingQueue<Task> taskQueue) {
        this.taskQueue = taskQueue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= numberOfTasks; i++) {
                Task task = new Task(i);
                taskQueue.put(task);
                System.out.println("Produced Task " + i);
                TimeUnit.MILLISECONDS.sleep(50);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
