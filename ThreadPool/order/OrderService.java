package ThreadPool.order;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class OrderService {

    private final ExecutorService executorService;
    private final BlockingQueue<Order> orderQueue;

    public OrderService(int threadPoolSize, int orderQueueCapacity) {
        this.executorService = Executors.newFixedThreadPool(threadPoolSize);
        this.orderQueue = new LinkedBlockingQueue<>(orderQueueCapacity);
        for (int i = 0; i < threadPoolSize; i++) {
            executorService.execute(new OrderProcessor(orderQueue));
        }
    }

    public void submitOrder(Order order) {
        try {
            orderQueue.put(order);
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
            System.out.println(exception.getMessage());
        }
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
