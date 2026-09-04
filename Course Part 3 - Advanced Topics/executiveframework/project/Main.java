package executiveframework.project;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n\n\n");

        List<CompletableFuture<Void>> futures = new ArrayList<>();
        int maxTime = 0;

        for (int i = 1; i <= 3; i++) {
            Site site = new Site("site" + i);
            maxTime = Math.max(maxTime, site.getResponseTime());
            futures.add(CompletableFuture.supplyAsync(site::quotePrice).thenAccept(System.out::println));
        }

        for (var f : futures) f.join();

        System.out.println("Retrieved all quotes in " + maxTime + "ms");
        System.out.println("\n\n\n");
    }
}
