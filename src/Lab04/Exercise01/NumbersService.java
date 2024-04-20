package Lab04.Exercise01;

import java.util.Arrays;

public class NumbersService {

    // 1.
    public static void oddNumbers(int a) {

        for (int i = 1; i <= a; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
    /*
    private static int[] addIndexToArray(int n, int... line) {
        int[] ints = new int[line.length + 1];
        int i = 0;
        while (i < line.length) {
            ints[i] = line[i];
            i++;
        }
        ints[line.length] = n;

        return ints;
    }

    public static void printArrayColumn(int... line) {
        for (int i = 0; i < line.length; i++) {
            System.out.println(line[i]);
        }
    }

    public static int[] oddNumbers(int a) {
        int[] ints = new int[0];
        int i = 0;
        while (i <= a) {
            if (i % 2 != 0) {
                ints = addIndexToArray(i, ints);
            }
            i++;
        }
        return ints;
    }
    */

    // 2.
    public static void twoDividers(Integer rangeUpTo, Integer divider1, Integer divider2) {

        int start = 1;

        System.out.print("Делится на " + divider1 + ":");
        int num = start;
        while (num <= rangeUpTo) {
            if (num % divider1 == 0) {
                System.out.print(" " + num);
            }
            num++;
        }
        System.out.println(";");

        System.out.print("Делится на " + divider2 + ":");
        num = start;
        while (num <= rangeUpTo) {
            if (num % divider2 == 0) {
                System.out.print(" " + num);
            }
            num++;
        }
        System.out.println(";");

        System.out.print("Делится на " + divider1 + " и на " + divider2 + ":");
        num = start;
        while (num <= rangeUpTo) {
            if (num % divider1 == 0 && num % divider2 == 0) {
                System.out.print(" " + num);
            }
            num++;
        }
        System.out.println(".");
    }

    // 3.
    public static boolean checkAmount(Integer num1, Integer num2, Integer sum) {
        if (num1 + num2 == sum) {
            return true;
        } else {
            return false;
        }
    }

    // 4.
    public static boolean comparisonOfNumbers(Integer num1, Integer num2, Integer num3) {
        if (num1 < num2 && num2 < num3) {
            return true;
        } else {
            return false;
        }
    }

    // 5.
    public static boolean checkingArrayEdges(Integer num, Integer... ar) {
        if (ar[0] == num | ar[ar.length - 1] == num) {
            return true;
        } else {
            return false;
        }
    }

    // 6.
    public static boolean checkingArrayForNumbers(Integer num1, Integer num2, Integer... ar) {
        int i = 0;
        while (i <= ar.length - 1) {
            if (ar[i] == num1 | ar[i] == num2) {
                return true;
            }
            i++;
        }
        return false;
    }
}
