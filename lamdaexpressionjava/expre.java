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

