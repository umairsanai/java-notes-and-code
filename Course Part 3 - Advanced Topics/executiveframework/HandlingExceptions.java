package executiveframework;

import java.util.concurrent.CompletableFuture;

public class HandlingExceptions {
    public static void main(String[] args) {


        /*
            CompletionStage is an interface which CompletableFuture class implements.

            To handle exceptions, it has a method called

            .exceptionally()

            which expects a lambda expression which takes the error in the argument
            and then return another value in the place of that exception.
        */

        CompletableFuture
        .supplyAsync(() -> {

            System.out.println("\n\n");

            if (Math.random() > 0.5)
                throw new Error("No user found!");

            System.out.println("Hello There! :)");
            return "Umair Anwar";
        })
        .exceptionally((err) -> "<<Guest User>>")
        .thenAcceptAsync((name) -> {
            System.out.println("Name: " + name + "\n");
            System.out.println(Thread.currentThread().getName() + "\n\n\n");
        });

        Utils.waitFor(100);
    }    
}