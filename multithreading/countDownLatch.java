public static void main(String[] args) {
    import java.util.concurrent.CountDownLatch;

public class Example {
    public static void main(String[] args) throws InterruptedException {
        int numThreads = 3;
        CountDownLatch latch = new CountDownLatch(numThreads);

        for (int i = 0; i < numThreads; i++) {
            Thread thread = new Thread(new WorkerThread(latch));
            thread.start();
        }

        // Wait for all worker threads to complete
        latch.await();

        System.out.println("All worker threads have completed their tasks.");
    }

    static class WorkerThread implements Runnable {
        private final CountDownLatch latch;

        public WorkerThread(CountDownLatch latch) {
            this.latch = latch;
        }

        public void run() {
            // Simulate some task being performed by the worker thread
            try {
                Thread.sleep(2000);
                System.out.println("Worker thread completed its task.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Signal that the task is completed
            latch.countDown();
        }
    }
}

}