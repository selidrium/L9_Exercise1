public class ThreadWaiterTwo implements Runnable {
    @Override
    public void run() {
        try {
            // Delay the code for 5 seconds
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread Waiter Two is done.");
    }
}
