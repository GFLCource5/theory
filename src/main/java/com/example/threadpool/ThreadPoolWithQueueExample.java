package com.example.threadpool;

import java.util.concurrent.*;


public class ThreadPoolWithQueueExample {
    public static void main(String[] args) {
        int numThreads = 4;
        int queueCapacity = 100;
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        BlockingQueue<Task> taskQueue = new LinkedBlockingQueue<>(queueCapacity);

        Thread producerThread = new Thread(new TaskProducer(taskQueue));
        producerThread.start();

        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < numThreads; i++) {
            executor.submit(new TaskConsumer(taskQueue));
        }

        executor.shutdown();
    }
}