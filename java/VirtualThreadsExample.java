import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Exercise 40: Virtual Threads (Java 21+)
 * Launch 100,000 virtual threads.
 * 
 * Run with: java --enable-preview VirtualThreadsExample
 * Or on Java 21+: java VirtualThreadsExample
 */
public class VirtualThreadsExample {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        var executor = Executors.newVirtualThreadPerTaskExecutor();
        for (int i = 0; i < 100_000; i++) {
            int taskId = i;
            executor.submit(() -> {
                System.out.println("Virtual thread " + taskId + " running");
            });
        }
        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);
        long end = System.currentTimeMillis();
        System.out.println("Launched 100,000 virtual threads in " + (end - start) + "ms");
    }
}
