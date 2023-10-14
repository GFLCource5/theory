package com.example.scheduled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
@EnableAsync
public class ScheduledService {

    private static final Logger logger = LoggerFactory.getLogger(ScheduledService.class);


    @Scheduled(fixedDelay = 1000)
    public void printFixDelay() {
        logger.info("print fix delay: " + LocalDateTime.now());
    }


    @Scheduled(fixedRate = 2000)
    public void printFixRate() {
        logger.info("print fix rate: " + LocalDateTime.now());
    }


    @Async
    @Scheduled(fixedRate = 2000)
    public void printAsyncFixedRate() throws InterruptedException {
        logger.info("print async fixed rate: " + LocalDateTime.now());
        Thread.sleep(3000);
    }

    @Scheduled(cron = "* * * * * *")
    public void printCron() {
        logger.info("print cron every minute: " + LocalDateTime.now());
    }

    @Async
    @Scheduled(cron = "1/3 * * * * *")
    public void printCronAsync() throws InterruptedException {
        logger.info("print async cron every third minute: " + LocalDateTime.now());
        Thread.sleep(2000);
    }

}
