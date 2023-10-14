package com.example.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
public class AppRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);
    private final AsyncService  service;

    public AppRunner(AsyncService service){
        this.service = service;
    }

    @Override
    public void run(String... args) throws Exception {
        long start = System.currentTimeMillis();

        CompletableFuture<Integer> number1 = service.generateNumber();
        CompletableFuture<Integer> number2 = service.generateNumber();
        CompletableFuture<Integer> number3 = service.generateNumber();

        CompletableFuture.allOf(number1,number2,number3).join();

        logger.info("Elapsed time: " + (System.currentTimeMillis() - start));
        logger.info("--> " + number1.get());
        logger.info("--> " + number2.get());
        logger.info("--> " + number3.get());

    }


}
