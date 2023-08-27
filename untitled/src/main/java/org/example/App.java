package org.example;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        int sum = 100;
        String[] products = {"pineapple", "cherry", "watermelon", "melon"};
        Salesman salesman = new SalesmanImpl();
        salesman.sell(sum, products);

        Salesman proxy = new ProxySalesman(salesman);
        proxy.sell(sum, products);

    }
}
