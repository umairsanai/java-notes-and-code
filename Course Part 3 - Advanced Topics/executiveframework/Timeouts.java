package executiveframework;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Timeouts {
    public static void main(String[] args) {
        System.out.println("\n\n\n");

        var name = CompletableFuture.supplyAsync(() -> {
            Utils.waitFor(5000);
            return "Umair";
        });

        /*
            Syntax:
            .completeOnTimeout(DEFAULT_VALUE, TIMEOUT_INTERVAL, UNIT)
        */

        name
            .completeOnTimeout("<<GUEST>>", 2, TimeUnit.SECONDS)
            .thenAccept((nameStr) -> System.out.println("Name: " + nameStr));

        name.join();
        System.out.println("\n\n\n");
    }
}
