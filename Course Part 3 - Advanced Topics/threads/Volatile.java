package threads;


// Volatile keyword tells the Java Compiler that don't optimize the code by saving this variable 
// in the cache or register. instead, read it fresh from memory everytime because this variable
// may get changed by another thread.

class Counter {

    // NOT THREAD-SAFE
    // private int sum;


    // THREAD-SAFE CODE:
    private volatile int sum;

    public Counter() {
        this.sum = 0;
    }
    public void increment() {
        // System.out.println("Incrementing.... " + Thread.currentThread().getName());
        this.sum += 1;
        // System.out.println("Incremented! " + Thread.currentThread().getName());
    }
    public int getSum() {
        return this.sum;
    }
}

public class Volatile {

    public static void main(String[] args) {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            c.increment();    
        });

        Thread t2 = new Thread(() -> {
            while (c.getSum() < 1) {}
            System.out.println(c.getSum());
        });

        t1.start();
        t2.start();
    }
}
