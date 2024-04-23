package Lab06.Exercise04;

import java.util.Scanner;

public class Parent {

    protected int num;

    public Parent() {
    }

    public void inPut() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        this.num = scanner.nextInt();
    }
}
