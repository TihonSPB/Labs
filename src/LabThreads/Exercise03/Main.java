package LabThreads.Exercise03;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {
        // 03
        int num = 100;

        Counter counter = new Counter();
        Thread[] runnable = new Thread[num];
        CountDownLatch latch = new CountDownLatch(num);

        for (int i = 0; i < num; i++) {
            runnable[i] = new Thread(new MyRunnable(counter, latch));
            runnable[i].start();
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter.getCount());
    }
}
