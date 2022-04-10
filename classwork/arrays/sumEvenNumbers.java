package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class sumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;

        int[] intArr = Arrays.stream(scanner.nextLine(). split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i : intArr) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
