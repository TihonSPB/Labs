package LabThreads.Exercise01_02;

import java.util.ArrayList;
import java.util.List;

public class MultipleThreads {
    // 01,02
    public static void numberPrinter(Integer numberOfThreads) {
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < numberOfThreads; i++) {
            Thread myThread = new MyThread();
            threads.add(myThread);

            System.out.println("Состояние потока " + myThread.getName() + " перед запуском: " + myThread.getState());
            myThread.start();
            System.out.println("Состояние потока " + myThread.getName() + " после запуска: " + myThread.getState());
        }

        for (Thread thread : threads) {
            while (thread.isAlive()) {
                System.out.println("Состояние потока " + thread.getName() + " во время выполнения: " + thread.getState());
            }
            System.out.println("Состояние потока " + thread.getName() + " после завершения: " + thread.getState());
        }
    }
}
