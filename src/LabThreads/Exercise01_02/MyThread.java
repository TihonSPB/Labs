package LabThreads.Exercise01_02;

public class MyThread extends Thread {
    // 01,02
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
