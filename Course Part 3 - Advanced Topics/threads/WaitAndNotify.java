package threads;

class HeavyTask {
    private Object incrementMonitor = new Object();

    public void performHeavyTask() {
        synchronized(incrementMonitor) {
            System.out.println("Performing Heavy Task..... " + Thread.currentThread().getName());
            try {

                Thread.sleep(2000);

                // We have to wrap this .notify() method in a synchronized with 
                // the monitor object that we are notifying.
                incrementMonitor.notify();
                System.out.println("Notified from performHeavyTask() - " + Thread.currentThread().getName());

                Thread.sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Heavy Task Finished! " + Thread.currentThread().getName());
        }
        
    }

    public void start() {
        synchronized(incrementMonitor) {
            System.out.println("Heavy Task started... " + Thread.currentThread().getName());
            try {
                /*
                    1. We have to wrap this .wait() method in a synchronized with 
                    the monitor object that we are notifying.

                    2. Code after .wait() only gets executed when the synchronized block 
                    in which .notify() method is wrapped, gets executed completely.
                
                */                
                incrementMonitor.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Heavy Task Done! " + Thread.currentThread().getName());
        }
    }
}

public class WaitAndNotify {
    public static void main(String[] args) {

        HeavyTask task = new HeavyTask();

        System.out.println("\n\n\n");

        Thread t1 = new Thread(task::start);
        Thread t2 = new Thread(task::performHeavyTask);
        
        t1.start();
        t2.start();
         
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n\n\n");
    }    
}
