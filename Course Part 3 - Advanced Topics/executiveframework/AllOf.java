package executiveframework;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AllOf {
    public static void main(String[] args) {

        var first = CompletableFuture.supplyAsync(() -> 1);
        var second = CompletableFuture.supplyAsync(() -> 2);
        var third = CompletableFuture.supplyAsync(() -> 3);

        CompletableFuture.allOf(first, second, third)
        .thenRun(() -> {

            System.out.println("\n\n\n");

            try {

                /*
                    If we want to get a value, we can get it like this.
                    Here, it won't block the Main thread. Because, all the asynchronous
                    operations have already been executed and the values are already there, ready to be used.
                    .get() method just gets them here without waiting for anything.
                */

                var f = first.get();
                System.out.println("First Value: " + f);

            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
            
            System.out.println("All values received!");
            System.out.println("\n\n\n");
        });
        


    }
}
