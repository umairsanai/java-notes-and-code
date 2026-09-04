package executiveframework;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class ThenApply {
    public static void main(String[] args) {


        /*
            thenApply() method on the CompletionStage interface is a method which
            takes a value, and recieves a value.
        */

        CompletableFuture
        .supplyAsync(() -> "umair,anwar")
        .thenApply((name) -> {
            return Arrays.stream(name.split(","))
                    .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                    .collect(Collectors.joining(" "));
        })
        .thenAcceptAsync((name) -> 
            System.out.println("\n\n" + "Name: " + name + "\n\n")
        );

        Utils.waitFor(100);
    }    
}