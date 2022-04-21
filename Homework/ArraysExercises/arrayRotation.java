package ArraysExercises;

import java.util.Scanner;

public class arrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rotations = scanner.nextInt();

        for (int i = 0; i < rotations; i++) {
            String firstElement = input[0];

            for (int j = 0; j < input.length-1; j++) {
                input[j] = input[j+1];
            }
            input[input.length-1] = firstElement;
        }
        for (String s : input) {
            System.out.print(s + " ");
        }
    }
}
