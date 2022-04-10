package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class equalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean isEqual = true;

        int[] arr1 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] arr2 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
            if (arr1[i] != arr2[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                isEqual = false;
                break;
            }
        }
        if (isEqual) System.out.println("Arrays are identical. Sum: " + sum);
    }
}
