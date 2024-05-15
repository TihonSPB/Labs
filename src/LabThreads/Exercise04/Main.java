package LabThreads.Exercise04;

public class Main {
    public static void main(String[] args) {
        // 04
        Integer lock = 0;

        MyThreadName one = new MyThreadName(lock, "Name1");
        MyThreadName two = new MyThreadName(lock, "Name2");

        one.start();
        two.start();
    }
}
