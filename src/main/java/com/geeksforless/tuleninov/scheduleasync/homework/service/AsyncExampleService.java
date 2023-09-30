package com.geeksforless.tuleninov.scheduleasync.homework.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class AsyncExampleService {

    private int taskNumber = 0;

    @Async(value = "customThreadPoolExecutor")
    @Scheduled(fixedDelay = 2000)
    public void asyncExample() {
        LocalTime startAt = LocalTime.now();
        System.out.printf("Task number %s, started at %s, thread name %s%n",
                taskNumber, startAt, Thread.currentThread().getName());
        taskNumber++;
    }
}
