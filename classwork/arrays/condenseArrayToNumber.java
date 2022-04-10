package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class condenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        if (arr.length <= 1) {
            System.out.println(arr[0] + " is already condensed to number");
        } else {
            int fixedSize = arr.length;
            for (int i = 0; i < fixedSize - 1; i++) {
                int[] condensed = new int[arr.length - 1];
                for (int j = 0; j < condensed.length; j++) {
                    condensed[j] = arr[j] + arr[j+1];
                }
                arr = condensed;
            }
            for (int d : arr) {
                System.out.println(d);
            }
        }
    }
}
