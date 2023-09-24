package ThreadPool.order;

import java.util.concurrent.BlockingQueue;

public class OrderProcessor implements Runnable {

    private final BlockingQueue<Order> orderQueue;

    public OrderProcessor(BlockingQueue<Order> orderQueue) {
        this.orderQueue = orderQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Order order = orderQueue.take();
                processOrder(order);
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    private void processOrder(Order order) {
        System.out.println("Order: " + order.getOrderId()
                + " - for: " + order.getCustomerName()
                + " - Thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Order: " + order.getOrderId() + " complete.");
    }
}
