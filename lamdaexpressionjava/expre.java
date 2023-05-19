package lamdaexpressionjava;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class expre {
    public static void main(String[] args) {
        // Sample data
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Perform operations concurrently using parallel Stream
        numbers.parallelStream()
                .map(num -> CompletableFuture.supplyAsync(() -> processNumber(num)))
                .map(CompletableFuture::join)
                .forEach(result -> System.out.println("Result: " + result));
    }

    // Process a number asynchronously
    public static int processNumber(int number) {
        System.out.println("Processing number: " + number);
        try {
            // Simulate some time-consuming computation
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return number * 2;
    }
}

/*
 * The numbers list is created with some sample data. 
 * These numbers will be processed concurrently.
The numbers list is converted into a parallel stream using parallelStream(). 
This allows the subsequent operations to be executed concurrently across multiple threads.
The map operation is applied to each number in the stream. Inside the map function, a
 CompletableFuture.supplyAsync method is called, which executes the processNumber 
 method asynchronously. This means that each number will be processed concurrently.
The map operation returns a stream of CompletableFuture objects. 
The CompletableFuture::join method is then applied to each CompletableFuture to obtain the result.
Finally, the forEach operation is used to print the result for each processed number.
 * 
 * 
 * 
 */