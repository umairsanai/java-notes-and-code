package executiveframework;

import java.util.concurrent.CompletableFuture;

public class CompletableFutures {
    public static void main(String[] args) {


        /*
            CompletableFuture is a class in java.util.concurrent package which has some factory
            methods to let us run our code concurrently.

            .runAsync() method takes a Runnable and runs it in the background. Not on the main thread.

            It lets us run the code without blocking the main thread.
        */

        CompletableFuture.runAsync(() -> {
            System.out.println("\n\nFrom runAsync: " + Thread.currentThread().getName());
            Utils.waitFor(2000);
            System.out.println("Heavy Processing Done......\n\n");
        });

        System.out.println("\n\nFrom Main: " + Thread.currentThread().getName());
        System.out.println("Doing Heavy Processing....\n\n");

        // Without this line of code, we won't the print from the passed lambda. Because main thread will complete it's task and end the program.
        Utils.waitFor(2500);
    }    
}
