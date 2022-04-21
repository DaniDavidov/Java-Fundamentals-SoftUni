package ArraysExercises;

import java.util.Scanner;

public class zigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        String[] arr1 = new String[iterations];
        String[] arr2 = new String[iterations];

        for (int i = 1; i <= iterations; i++) {
            String[] input = scanner.nextLine().split(" ");
            if (i % 2 != 0) {
                arr1[i - 1] = input[0];
                arr2[i - 1] = input[1];
            } else {
                arr1[i - 1] = input[1];
                arr2[i - 1] = input[0];
            }
        }
        for (String s : arr1) {
            System.out.print(s + " ");
        }
        for (String p : arr2) {
            System.out.print(p + " ");
        }
    }
}
