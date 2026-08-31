package threads;

public class HeavyProcessing implements Runnable {
    public void run() {
        System.out.println("Performing Heavy Processing - " + Thread.currentThread().getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Heavy Processing Completed - " + Thread.currentThread().getName());
    }   
}
