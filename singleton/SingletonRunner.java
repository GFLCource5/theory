package singleton;


public class SingletonRunner {

    public static void main(String[] args) {
        Thread threadFirst = new Thread(new FirstClass());
        Thread threadSecond = new Thread(new SecondClass());
        threadFirst.start();
        threadSecond.start();
    }

    static class FirstClass implements Runnable {
        @Override
        public void run() {
            Singleton instance = Singleton.getInstance("Test 1");
            System.out.println("First thread: " + instance.getType());
        }
    }

    static class SecondClass implements Runnable {
        @Override
        public void run() {
            Singleton instance = Singleton.getInstance("Test 2");
            System.out.println("Second thread: " + instance.getType());
        }
    }
}




