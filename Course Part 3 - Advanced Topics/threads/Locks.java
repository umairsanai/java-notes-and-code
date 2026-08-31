package threads;

import java.text.NumberFormat;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class CounterWithLocks {
    private int sum;
    private Lock lock = new ReentrantLock();

    public CounterWithLocks() {
        this.sum = 0;
    }
    public void increment() {
        lock.lock();
        try {
            this.sum += 1;
        } finally {
            // BEST PRACTICE: Wrap the unlock in a finally block so that even if 
            // the code after locking the thread throws an error, the lock can safely
            // be unlocked and avoid any unexpected conditions like Deadlocks etc. 
            lock.unlock();
        }
    }
    public int getSum() {
        return this.sum;
    }
}


class HeavyTask implements Runnable {
    private CounterWithLocks c;
    private int LIMIT = 1_000_000;
    public HeavyTask(CounterWithLocks c) {
        this.c = c;
    }
    @Override
    public void run() {
        for (int i = 0; i < this.LIMIT; i++) {
            c.increment();
        }
    }
}

public class Locks {
    public static void main(String[] args) {

        CounterWithLocks c = new CounterWithLocks();

        Thread t1 = new Thread(new HeavyTask(c));
        Thread t2 = new Thread(new HeavyTask(c));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Expected Sum:   2,000,000\nCalculated Sum: " + NumberFormat.getIntegerInstance().format(c.getSum()));
    }
}