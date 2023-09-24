package ThreadPool;

import ThreadPool.order.Order;
import ThreadPool.order.OrderService;

public class Main {

    private final int THREAD_POOL_SIZE = 3;
    private final int ORDER_QUEUE_CAPACITY = 9;

    public static void main(String[] args) {

        Main main = new Main();
        OrderService orderService = new OrderService(main.THREAD_POOL_SIZE, main.ORDER_QUEUE_CAPACITY);
        for (int i = 0; i < 10; i++) {
            Order order = new Order(i, "Name" + i);
            orderService.submitOrder(order);
        }
        orderService.shutdown();
    }
}
