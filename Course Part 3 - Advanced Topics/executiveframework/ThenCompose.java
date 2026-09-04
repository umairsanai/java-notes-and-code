package executiveframework;

import java.util.concurrent.CompletableFuture;

public class ThenCompose {
    public static void main(String[] args) {

        /*
            The same thing can be done by thenAcceptAsync instead of using thenComposeAsync.
            But, they both have different usecases. They have a very subtle difference which makes
            it very clear when to choose one over the other.


            Gemini Chat:
            https://share.gemini.google/A9x1UO4Mwh0i
        */

        System.out.println("\n\n\n");

        fetchUsername()
        .thenComposeAsync(ThenCompose::fetchEmail)
        .thenAcceptAsync((email) -> System.out.println("Email: " + email + "\n\n\n"));

        Utils.waitFor(100);
    }

    private static CompletableFuture<String> fetchUsername() {
        return CompletableFuture.supplyAsync(() -> "umair.anwar.99");
    }

    private static CompletableFuture<String> fetchEmail(String username) {
        return CompletableFuture.supplyAsync(() -> {
            if (username == "umair.anwar.99") return "anwarumair801@gmail.com";
            return "randommail69@gmail.com";
        });
    }
}
