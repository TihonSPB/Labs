package Lab02.Exercise01;

public class Main {
    public static void main(String[] args) {
        // +
        System.out.println(Calculator.sum(5, 5));
        System.out.println(Calculator.sum(5, 5.6));
        System.out.println(Calculator.sum(5, 50000000000L));
        System.out.println(Calculator.sum(50000000000L, 50000000000L));
        System.out.println(Calculator.sum(50000000000L, 5));
        System.out.println(Calculator.sum(50000000000L, 5.6));
        System.out.println(Calculator.sum(5.6, 5));
        System.out.println(Calculator.sum(5.6, 50000000000L));
        System.out.println(Calculator.sum(5.6, 5.6));

        // -
        System.out.println(Calculator.subtraction(10, 5));
        System.out.println(Calculator.subtraction(5, 5.6));
        System.out.println(Calculator.subtraction(5, 50000000000L));
        System.out.println(Calculator.subtraction(50000000000L, 50000000000L));
        System.out.println(Calculator.subtraction(50000000000L, 5));
        System.out.println(Calculator.subtraction(50000000000L, 5.6));
        System.out.println(Calculator.subtraction(5.6, 5));
        System.out.println(Calculator.subtraction(5.6, 50000000000L));
        System.out.println(Calculator.subtraction(5.6, 5.6));
        // *
        System.out.println(Calculator.multiplying(105, 50));
        System.out.println(Calculator.multiplying(5, 5.6));
        System.out.println(Calculator.multiplying(5, 50000000000L));
        System.out.println(Calculator.multiplying(50000000000L, 50000000000L));
        System.out.println(Calculator.multiplying(50000000000L, 5));
        System.out.println(Calculator.multiplying(50000000000L, 5.6));
        System.out.println(Calculator.multiplying(5.6, 5));
        System.out.println(Calculator.multiplying(5.6, 50000000000L));
        System.out.println(Calculator.multiplying(5.6, 5.6));
        // /
        System.out.println(Calculator.dividing(100, 50));
        System.out.println(Calculator.dividing(5, 5.6));
        System.out.println(Calculator.dividing(5, 50000000000L));
        System.out.println(Calculator.dividing(50000000000L, 50000000000L));
        System.out.println(Calculator.dividing(50000000000L, 5));
        System.out.println(Calculator.dividing(50000000000L, 5.6));
        System.out.println(Calculator.dividing(5.6, 5));
        System.out.println(Calculator.dividing(5.6, 50000000000L));
        System.out.println(Calculator.dividing(5.6, 5.6));
    }
}
