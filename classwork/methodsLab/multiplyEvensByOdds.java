package methodsLab;

import java.util.Scanner;

public class multiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = readIntArray(scanner.nextLine());

        int result = calculateEvenSum(array) * calculateOddSum(array);
        System.out.println(result);
    }

    static int[] readIntArray(String input) {
        String[] arr = input.split(" ");
        int[] intArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }
        return intArr;
    }

    static int calculateEvenSum(int[] array) {
        int evenSum = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                evenSum += j;
            }
        }
        return evenSum;
    }
    static int calculateOddSum(int[] array) {
        int oddSum = 0;
        for (int j : array) {
            if (j % 2 != 0) {
                oddSum += j;
            }
        }
        return oddSum;
    }
}
