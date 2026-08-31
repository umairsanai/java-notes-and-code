package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollections {
    public static void main(String[] args) {


        // NOT THREAD SAFE CODE. ISN'T SUITABLE FOR BEING USED THROUGH MULTIPLE THREADS.
        // PRODUCES UNPREDICTABLE RESULTS DUE TO RACE CONDITIONS.
        // List<Integer> arr = new ArrayList<>(); 

        // CORRECT COLLECTION TO USE: (Concurrent Array List)
        List<Integer> arr = new CopyOnWriteArrayList<>(); 
        List<Thread> threads = new ArrayList<>();

        final int INTEGERS_PER_THREAD = 100;
        final int THREADS = 10;
        
        for (int i = 1; i <= THREADS; i++) {
            threads.add(new Thread(() -> {
                for (int j = 1; j <= INTEGERS_PER_THREAD; j++) {
                    arr.add((int) Math.round(Math.random() * 1000));
                }
            }));
        }

        for (var t : threads) t.start();
        for (var t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }

        System.out.println("Expected Size: " + THREADS * INTEGERS_PER_THREAD + "\nActual Size:   " + arr.size());
    }

}
