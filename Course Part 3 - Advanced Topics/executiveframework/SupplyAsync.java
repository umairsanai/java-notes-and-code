package executiveframework;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class SupplyAsync {
    public static void main(String[] args) {


        /*
            CompletableFuture is a class in java.util.concurrent package which has some factory
            methods to let us run our code concurrently.

            .supplyAsync() is an static method on CompletableFuture class
            that takes a Callable and runs it in the background. Not on the main thread.

            It lets us run the code without blocking the main thread.
        */

        var status = CompletableFuture.supplyAsync(() -> {
            try {
                Utils.waitFor(2000);
                System.out.println("\n\nFrom supplyAsync: " + Thread.currentThread().getName());
                System.out.println("Heavy Processing Done......\n\n");

                if (Math.random() > 0.5)
                    throw new Error("Random Error!");

                return "success";
            } catch(Throwable exception) {
                System.out.println("ERROR: " + exception.getMessage());
                return "fail";
            }
        });

        System.out.println("\n\nFrom Main: " + Thread.currentThread().getName());
        System.out.println("Doing Heavy Processing....\n\n");

        try {
            System.out.println("\n\nStatus of the operation: " + status.get() + "\n\n");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

    }    
}