

import java.util.LinkedList;
import java.util.Queue;public class queue {


public class Example {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        // Remove an element from the queue
        String head = queue.remove();
        System.out.println("Removed: " + head);

        // Peek at the next element in the queue
        String next = queue.peek();
        System.out.println("Next: " + next);

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is empty? " + isEmpty);
    }
}

}

/*
 * In Java, a queue is a data structure that follows the First-In-First-Out (FIFO) principle. 
 * The Java Collections framework provides an interface called Queue that represents a queue.

Here's an example of how to use the Queue interface in Java:
 */