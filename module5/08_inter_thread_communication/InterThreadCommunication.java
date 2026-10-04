class Message {
    private String message;
    private boolean available;

    synchronized void put(String message) throws InterruptedException {
        while (available) {
            wait();
        }

        this.message = message;
        available = true;
        notify();
    }

    synchronized String get() throws InterruptedException {
        while (!available) {
            wait();
        }

        String result = message;
        available = false;
        notify();

        return result;
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) throws InterruptedException {
        Message message = new Message();

        Thread producer = new Thread(() -> {
            try {
                message.put("Hello from producer");
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                System.out.println(message.get());
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
        });

        consumer.start();
        producer.start();

        producer.join();
        consumer.join();
    }
}
