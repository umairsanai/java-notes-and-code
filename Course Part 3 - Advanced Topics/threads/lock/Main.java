package threads.lock;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var counter = new Counter();
        
        List<Thread> threadsList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new LongArrayAdder(counter));
            threadsList.add(t);
            t.start();
        }

        for (var t : threadsList) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n\n\nCounter: " + counter.getSum() + " " + counter.getAdvancedSum());
    }   
}
