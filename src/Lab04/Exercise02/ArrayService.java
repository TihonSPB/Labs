package Lab04.Exercise02;

import java.util.Scanner;

public class ArrayService {

    // 1
    public static String checkingArrayForSorting(Integer[] ar) {
        int i = 0;
        while (i < ar.length - 1) {
            if (ar[i] > ar[i + 1]) {
                return "Please, try again";
            }
            i++;
        }
        return "OK";
    }

    // 2
    public static Integer[] fillingAnArray(Integer... ar) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while (i <= ar.length - 1) {
            System.out.print("Введите число №" + (i + 1) + ": ");
            ar[i] = scanner.nextInt();
            i++;
        }
        return ar;
    }

    // 3
    public static Integer[] exchangeOfExtremeNumbers(Integer... ar) {
        Integer first = ar[0];
        ar[0] = ar[ar.length - 1];
        ar[ar.length - 1] = first;
        return ar;
    }

    // 4
    public static Integer firstUniqueNumber(Integer... ar) {
        int i = 0;
        while (i <= ar.length - 1) {
            Integer n = ar[i];

            int j = 0;
            while (j <= ar.length - 1) {
                if (i == j) {
                    if (j == ar.length - 1) {
                        return n;
                    }
                    j++;
                } else if (ar[j] == n) {
                    break;
                } else if (j == ar.length - 1) {
                    return n;
                } else {
                    j++;
                }
            }
            i++;
        }
        System.out.println("Уникальное число отсутствует");
        return null;
    }

    // 5
    public static Integer[] mergeSort(Integer... ar) {
/*

        //сортировка пузырьком
        for (int i=0;i< ar.length;i++){
            for(int j=0; j< ar.length;j++){
                if(ar[i]<ar[j]){
                    int aj=ar[j];
                    int ai=ar[i];

                    ar[j]=ai;
                    ar[i]=aj;
                }
            }
        }
        return ar;
*/
        if (ar.length <= 1) {
            return ar;
        }
        int mid = ar.length / 2;
        Integer[] left = new Integer[mid];
        Integer[] right = new Integer[ar.length - mid];

        for (int i = 0; i < left.length; i++) {
            left[i] = ar[i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = ar[mid + i];
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return mergeParts(left, right);
    }

    private static Integer[] mergeParts(Integer[] left, Integer[] right) {
        Integer[] res = new Integer[left.length + right.length];
        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;
        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    res[resultPointer++] = left[leftPointer++];
                } else {
                    res[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                res[resultPointer++] = left[leftPointer++];
            } else if (rightPointer < right.length) {
                res[resultPointer++] = right[rightPointer++];
            }
        }
        return res;
    }
}


