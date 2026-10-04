class Worker extends Thread {
    @Override
    public void run() {
        System.out.println("Worker thread is running.");
    }
}

public class CreatingThreads {
    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();
        worker.start();
        worker.join();
    }
}
