package textProcessingExercise;

import java.util.Scanner;

import static java.lang.Integer.sum;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        char[] arr1 = input[0].toCharArray();
        char[] arr2 = input[1].toCharArray();

        int result = sum(arr1, arr2);
        System.out.println(result);
    }

    private static int sum(char[] arr1, char[] arr2) {
        int longer = Math.max(arr1.length, arr2.length);
        int shorter = Math.min(arr1.length, arr2.length);
        int sum = 0;

        for (int i = 0; i < longer; i++) {
            if (i < shorter) {
                sum += arr1[i] * arr2[i];
            } else if (arr1.length > arr2.length) {
                sum += arr1[i];
            } else {
                sum += arr2[i];
            }
        }
        return sum;
    }
}
