package LabThreads.Exercise03;

public class Counter {
    // 03
    int count = 0;

    public synchronized void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }

}
