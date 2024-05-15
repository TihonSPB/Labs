package LabThreads.Exercise03;

import java.util.concurrent.CountDownLatch;

public class MyRunnable implements Runnable {
    // 03
    private final Counter r;
    private final CountDownLatch l;

    public MyRunnable(Counter r, CountDownLatch l) {
        this.r = r;
        this.l = l;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            r.increment();
        }
        l.countDown();
    }
}
