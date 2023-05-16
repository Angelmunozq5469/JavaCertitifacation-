package multithreading;

    
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class Example {
    public static void main(String[] args) {
        // Create a BlockingQueue with a maximum capacity of 10
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

        // Create producer and consumer threads
        Thread producerThread = new Thread(new Producer(queu));
        Thread consumerThread = new Thread(new Consumer(queue));

        // Start the threads
        producerThread.start();
        consumerThread.start();
    }

    static class Producer implements Runnable {
        private final BlockingQueue<String> queue;

        public Producer(BlockingQueue<String> queue) {
            this.queue = queue;
        }

        public void run() {
            try {
                for (int i = 1; i <= 10; i++) {
                    String message = "Message " + i;
                    queue.put(message);
                    System.out.println("Producer produced: " + message);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Consumer implements Runnable {
        private final BlockingQueue<String> queue;

        public Consumer(BlockingQueue<String> queue) {
            this.queue = queue;
        }

        public void run() {
            try {
                for (int i = 1; i <= 10; i++) {
                    String message = queue.take();
                    System.out.println("Consumer consumed: " + message);
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


