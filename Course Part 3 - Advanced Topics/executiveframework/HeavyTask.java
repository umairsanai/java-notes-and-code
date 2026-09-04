package executiveframework;

import java.util.concurrent.CompletableFuture;

public class HeavyTask {
    public static void perform() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // This is how we make our APIs which can also run our normal synchronous functions asynchronously.

    public static CompletableFuture<Void> performAsync() {
        return CompletableFuture.runAsync(HeavyTask::perform);
    }

}
