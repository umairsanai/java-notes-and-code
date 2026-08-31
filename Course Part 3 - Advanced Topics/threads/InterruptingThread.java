package threads;

public class InterruptingThread {
    public static void main(String[] args) {
        
        Thread t1 = new Thread(() -> {
            System.out.println("Doing some heavy work... " + Thread.currentThread().getName());
            for (long i = 1; i <= 1_000_000; i++) {
                if (Thread.interrupted()) {
                    System.out.println("Heavy work interrputed... - " + Thread.currentThread().getName());
                    return;
                }
                System.out.println("Counting: " + i);
            }
            System.out.println("Heavy work completed! - " + Thread.currentThread().getName());            
        });

        t1.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        t1.interrupt();
        
    }
}
