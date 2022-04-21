package ArraysExercises;

import java.util.Scanner;

public class maxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] array = new int[input.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        int longestNum = 0;
        int longestLength = 1;

        for (int i = 0; i < array.length; i++) {
            int currentLength = 1;
            int currentNum = 0;
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    currentNum = array[i];
                    currentLength++;
                } else {
                    break;
                }
            }
            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestNum = currentNum;
            }
        }
        for (int i = 0; i < longestLength; i++) {
            System.out.print(longestNum + " ");
        }
    }
}
