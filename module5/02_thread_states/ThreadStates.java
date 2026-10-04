public class ThreadStates {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
        });

        System.out.println("Before start: " + thread.getState());

        thread.start();

        System.out.println("After start: " + thread.getState());

        thread.join();

        System.out.println("After completion: " + thread.getState());
    }
}
