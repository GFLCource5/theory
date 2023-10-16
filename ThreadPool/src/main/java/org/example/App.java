package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws InterruptedException {
        List<String> list = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(() -> list.add("First submit " + Thread.currentThread().getName()));
        executorService.submit(() -> list.add("Second submit " + Thread.currentThread().getName()));
        executorService.submit(() -> list.add("Third submit " + Thread.currentThread().getName()));

        executorService.awaitTermination(3, TimeUnit.SECONDS);

        list.forEach(System.out::println);

        executorService.shutdown();

    }

}
