package Lab04.Exercise02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1
        Integer[] ar1 = new Integer[]{-9, 3, 8, 10, 15, 16, 20, 20, 25};
        System.out.println(ArrayService.checkingArrayForSorting(ar1));

        // 2
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int arLength = scanner.nextInt();
        Integer[] ar2 = new Integer[arLength];
        ar2 = ArrayService.fillingAnArray(ar2);
        System.out.println("Result = " + Arrays.toString(ar2));

        // 3
        Integer[] ar3 = {5, 6, 7, 2};
        System.out.println("Array 1: " + Arrays.toString(ar3));
        ar3 = ArrayService.exchangeOfExtremeNumbers(ar3);
        System.out.println("Array 2: " + Arrays.toString(ar3));

        // 4
        Integer[] ar4 = new Integer[]{5, 4, 5, 4, 5, 1};
        System.out.println(ArrayService.firstUniqueNumber(ar4));

        // 5
        Integer[] ar5 = {8, 22, 55, 3, 2, 8, 10, 105, -7, 25, 15};
        System.out.println(Arrays.toString(ArrayService.mergeSort(ar5)));
    }
}
