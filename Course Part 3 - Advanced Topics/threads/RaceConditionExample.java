package threads;

import java.text.NumberFormat;

class Counter {
    private int sum;
    public Counter() {
        this.sum = 0;
    }
    public void increment() {
        this.sum += 1;
    }
    public int getSum() {
        return this.sum;
    }
}


class HeavyTask implements Runnable {
    private Counter c;
    private int LIMIT = 1_000_000;
    public HeavyTask(Counter c) {
        this.c = c;
    }
    @Override
    public void run() {
        for (int i = 0; i < this.LIMIT; i++) {
            c.increment();
        }
    }
}

public class RaceConditionExample {
    public static void main(String[] args) {

        Counter c = new Counter();

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
