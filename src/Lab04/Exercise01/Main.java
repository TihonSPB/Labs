package Lab04.Exercise01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1
        NumbersService.oddNumbers(99);
        /*
        int[] one = NumbersService.oddNumbers(99);
        NumbersService.printArrayColumn(one);
         */

        // 2
        NumbersService.twoDividers(100, 3, 5);

        // 3
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        Integer num1 = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        Integer num2 = scanner.nextInt();
        System.out.print("Введите третье целое число: ");
        Integer sum = scanner.nextInt();

        boolean check = NumbersService.checkAmount(num1, num2, sum);
        System.out.println("Результат: " + check);

        // 4
        System.out.print("Введите первое целое число: ");
        num1 = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        num2 = scanner.nextInt();
        System.out.print("Введите третье целое число: ");
        Integer num3 = scanner.nextInt();

        check = NumbersService.comparisonOfNumbers(num1, num2, num3);
        System.out.println("Результат: " + check);

        // 5
        Integer numberIsChecked = 3;
        Integer[] ar1 = new Integer[]{3, -3, 7, 4, 5, 4, 3};
        boolean answer = NumbersService.checkingArrayEdges(numberIsChecked, ar1);
        System.out.println("array = " + Arrays.toString(ar1));
        System.out.println(answer);

        // 6
        Integer numberIsChecked1 = 1;
        Integer numberIsChecked2 = 3;
        Integer[] ar2 = new Integer[]{4, -3, 7, 4, 1, 4, 2};
        answer = NumbersService.checkingArrayForNumbers(numberIsChecked1, numberIsChecked2, ar2);
        System.out.println(answer);

    }
}
