package textProcessingExercise;

import java.util.Locale;
import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        double result = 0;
        for (String s : input) {
            double sum = 0;
            char letterBefore = s.charAt(0);
            char letterAfter = s.charAt(s.length()-1);
            String digits = s.substring(1, s.length()-1);
            double number = Double.parseDouble(digits);
            int firstLetterPosition = getAphabeticPosition(letterBefore);
            int secondLetterPosition = getAphabeticPosition(letterAfter);

            if (Character.isUpperCase(letterBefore)) {
                result += number / firstLetterPosition;
            } else {
                result += number * firstLetterPosition;
            }
            if (Character.isUpperCase(letterAfter)) {
                result -= secondLetterPosition;
            } else {
                result += secondLetterPosition;
            }
        }
        System.out.printf("%.2f", result);
    }

    private static int getAphabeticPosition(char c) {
        return Character.toLowerCase(c) - 96;
    }

}
