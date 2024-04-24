package Lab06.Exercise05;

import java.util.Scanner;

public class Parent {

    protected int age;
    protected Scanner scanner;

    public Parent() {
        this.scanner = new Scanner(System.in);
    }

    public void inPut() {
        System.out.print("Введите возраст: ");
        this.age = scanner.nextInt();
    }
}
