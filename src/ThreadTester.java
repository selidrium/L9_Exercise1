public class ThreadTester {
    public static void main(String[] args) {
        // Create instances of the two classes
        ThreadWaiterOne threadWaiterOne = new ThreadWaiterOne();
        ThreadWaiterTwo threadWaiterTwo = new ThreadWaiterTwo();

        // Create and start the threads
        Thread t1 = new Thread(threadWaiterOne);
        Thread t2 = new Thread(threadWaiterTwo);
        t1.start();
        t2.start();

        try {
            // Wait for the threads to finish
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads are done.");
    }
}
