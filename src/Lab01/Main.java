package Lab01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");

        //2.
        double a = 46;
        double l = 10;
        int c = 3;
        int d = 29;
        int e = 4;
        int f = -15;
        double res1 = (a + l) * (l / c);
        //double res1 = (46+10)*(10.0/3);
        int res2 = d * e * f;
        //int res2 = 29*4*(-15);
        System.out.println("Упражнение 2.1: " + res1);
        System.out.println("Упражнение 2.2: " + res2);

        //3.
        int number = 10500;
        int result3 = (number / 10) / 10;
        System.out.println("Упражнение 3: " + result3);

        //4.
        double result4 = 3.6 * 4.1 * 5.9;
        System.out.println("Упражнение 4: " + result4);

        //5.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int first = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int second = scanner.nextInt();
        System.out.print("Введите третье целое число: ");
        int third = scanner.nextInt();
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        //6.
        System.out.print("Введите целое число: ");
        int b = scanner.nextInt();
        if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else if (b <= 100) {
            System.out.println("Четное");
        } else {
            System.out.println("Выход за пределы диапазона");
        }

    }

}
