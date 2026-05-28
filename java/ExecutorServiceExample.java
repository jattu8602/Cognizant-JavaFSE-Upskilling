import java.util.concurrent.*;

/**
 * Exercise 41: Executor Service and Callable
 * Executes multiple Callable tasks that return results.
 */
public class ExecutorServiceExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Callable<Integer> task = () -> {
            int sum = 0;
            for (int i = 1; i <= 10; i++) sum += i;
            return sum;
        };
        Future<Integer> f1 = executor.submit(task);
        Future<Integer> f2 = executor.submit(task);
        Future<Integer> f3 = executor.submit(task);
        System.out.println("Result 1: " + f1.get());
        System.out.println("Result 2: " + f2.get());
        System.out.println("Result 3: " + f3.get());
        executor.shutdown();
    }
}
