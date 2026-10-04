class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable task is running.");
    }
}

public class RunnableExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Task());
        thread.start();
        thread.join();
    }
}
