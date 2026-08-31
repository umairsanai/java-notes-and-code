package threads.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/*
    NOTE: This class uses one Lock multiple times without unlocking in a following manner:
    .lock()
        .lock()
        .unlock()
    .unlock()

    And, the ReentrantLock() implementation of the Lock interface supports it.
*/

public class Counter {
    private int sum;
    private int advancedSum;
    private Lock lock = new ReentrantLock();
    public Counter() {
        this.sum = 0;
        this.advancedSum = 1000;
    }
    public void increment() {
        lock.lock();
        try {
            this.sum += 1;
            incrementAdvancedSum();
        } finally {
            lock.unlock();
        }
    }
    
    private void incrementAdvancedSum() {
        lock.lock();
        try {
            this.advancedSum += 1;
        } finally {
            lock.unlock();
        }
    }
    public int getSum() {
        return this.sum;
    }
    public int getAdvancedSum() {
        return this.advancedSum;
    }
}
