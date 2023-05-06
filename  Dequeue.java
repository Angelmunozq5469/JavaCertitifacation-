import java.util.ArrayDeque;
import java.util.Deque;

/**
 *  Dequeue
 */
public class  Dequeue {

    public class Example {
        public static void main(String[] args) {
            Deque<String> deque = new ArrayDeque<>();
    
            // Add elements to the front and back of the deque
            deque.addFirst("Alice");
            deque.addLast("Bob");
            deque.addFirst("Charlie");
    
            // Remove elements from the front and back of the deque
            String head = deque.removeFirst();
            String tail = deque.removeLast();
            System.out.println("Removed: " + head + " and " + tail);
    
            // Peek at the first and last elements of the deque
            String first = deque.peekFirst();
            String last = deque.peekLast();
            System.out.println("First: " + first + " and Last: " + last);
    
            // Check the size of the deque
            int size = deque.size();
            System.out.println("Size: " + size);
        }
    }
}

/*
 * On Java, a deque (double-ended queue) is a data structure that allows insertion and removal of elements from both 
 * ends. The Java Collections framework provides an interface called Deque that represents a deque.

Here's an example of how to use the Deque interface in Java:
 */