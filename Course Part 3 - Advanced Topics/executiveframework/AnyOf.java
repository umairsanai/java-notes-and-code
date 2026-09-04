package executiveframework;

import java.util.concurrent.CompletableFuture;

public class AnyOf {
    public static void main(String[] args) {
        System.out.println("\n\n\n");

        var name = CompletableFuture.supplyAsync(() -> {
            // Utils.waitFor(10);
            return "Umair";
        });
        var age = CompletableFuture.supplyAsync(() ->  {
            // Utils.waitFor(10);
            return 20;
        });
        var isStudent = CompletableFuture.supplyAsync(() -> {
            // Utils.waitFor(30);
            return true; 
        });


        CompletableFuture.anyOf(name, age, isStudent)
        .thenAccept((a) -> System.out.println(a));


        Utils.waitFor(100);
        System.out.println("\n\n\n");
    }
}
