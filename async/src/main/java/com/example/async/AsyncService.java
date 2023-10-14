package com.example.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AsyncService {

    private static final Logger logger = LoggerFactory.getLogger(AsyncService.class);

    public int generateNumber() throws InterruptedException {
        logger.info("Start generate" + Thread.currentThread().getName());
        int number = LocalDateTime.now().getSecond();
        int randomNumber = number - getRandomInt(number/3, number/2);
        Thread.sleep(randomNumber);
        logger.info("Finish generate" + Thread.currentThread().getName());
        return randomNumber;
    }

    private int getRandomInt(int min, int max) {
        return (int) (min + Math.random() * max);
    }

}
