package executiveframework;

import java.util.concurrent.Executors;

public class Executor {
    public static void main(String[] args) {
        var executor = Executors.newFixedThreadPool(3);

        try {
            for (int i = 0; i < 10; i++) {
                executor.submit(() -> {
                    System.out.println("Thread Name: " + Thread.currentThread().getName());
                });
            }
        } finally {

            // We have to explicitly call the .shutdown() method to stop the executor, 
            // otherwise it will never know that we are done with our program, 
            // and the program will keep running indefinitely...

            executor.shutdown();
        }

    }
}
