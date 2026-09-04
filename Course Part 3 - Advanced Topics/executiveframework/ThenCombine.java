package executiveframework;

import java.util.concurrent.CompletableFuture;

public class ThenCombine {
    public static void main(String[] args) {

        /*
            thenCombine() method lets us combine the result of two CompleteableFutures.
        */

        var users = fetchUser();
        var generalStatisticsFutrue = fetchGeneralStatistics();

        users.thenCombine(generalStatisticsFutrue, 
                        (user, stats) -> "\n\n\n" + user + "\n\n\n" + stats + "\n\n\n")
            .thenAcceptAsync(System.out::println);


        Utils.waitFor(100);
    }

    private static CompletableFuture<String> fetchUser() {
        return CompletableFuture.supplyAsync(() -> "Name: Umair Anwar\nProgram: BSCS\nDOB: 4th June, 2006\nReg No: 2024641");
    }

    private static CompletableFuture<String> fetchGeneralStatistics() {
        return CompletableFuture.supplyAsync(() -> "Stat 1: 90%\nStat 2: $7.5B\nStat 3: < 2030");
    }
}
