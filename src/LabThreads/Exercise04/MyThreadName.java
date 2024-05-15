package LabThreads.Exercise04;

public class MyThreadName extends Thread {
    // 04
    private final Integer lock;
    private final String name;

    public MyThreadName(Integer lock, String name) {
        this.lock = lock;
        this.name = name;
    }

    @Override
    public void run() {
        synchronized (lock) {
            while (true) {
                System.out.println("Поток: " + getName() + ", имя: " + name);
                lock.notify();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
