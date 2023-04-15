public class ThreadWaiterOne implements Runnable {
    @Override
    public void run() {
        try {
            // Delay the code for 20 seconds
            Thread.sleep(20 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread Waiter One is done.");
    }
}
