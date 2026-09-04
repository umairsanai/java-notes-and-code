package executiveframework;

import java.util.concurrent.CompletableFuture;

public class CompletionStageInterface {
    public static void main(String[] args) {


        /*
            CompletionStage is an interface which CompletableFuture class implements.

            It defines the methods like:
                thenRun()
                thenRunAsync()

                thenAccept()
                thenAcceptAsync()

                thenApply()
                thenApplyAsync()

            and many other more.

            With their help, we can chain these methods after one another on the
            CompletableFuture as methods like runAsync(), supplyAsync() return new
            CompletableFuture instances. So, just like streams, we can chain the methods
            and create the processing pipelines asynchronously.
        */



        CompletableFuture
        .supplyAsync(() -> {            
            System.out.println("\n\n" + Thread.currentThread().getName() + "\n\n");
            try {
                Utils.waitFor(2000);
            } catch(Throwable exception) {
                System.out.println("ERROR: " + exception.getMessage());
            }
            return "umair";
        })
        .thenAcceptAsync((name) -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Name: " + name + "\n\n");
        });

        Utils.waitFor(2500);

    }    
}