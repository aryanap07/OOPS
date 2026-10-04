class Worker extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("Work completed.");
        } catch (InterruptedException exception) {
            System.out.println("Thread interrupted.");
        }
    }
}

public class InterruptingThreads {
    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();
        worker.start();

        Thread.sleep(100);
        worker.interrupt();
        worker.join();
    }
}
