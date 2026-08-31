package threads.lock;

public class LongArrayAdder implements Runnable {
    private Counter counter;
    public LongArrayAdder(Counter counter) {
        this.counter = counter;        
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            this.counter.increment();
        }
        System.out.println("Task Completed - Thread " + Thread.currentThread().getName());
    }    
}
