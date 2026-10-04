class Counter {
    private int value;

    synchronized void increment() {
        value++;
    }

    int getValue() {
        return value;
    }
}

public class SynchronizingThreads {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread first = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread second = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        first.start();
        second.start();

        first.join();
        second.join();

        System.out.println("Counter: " + counter.getValue());
    }
}
