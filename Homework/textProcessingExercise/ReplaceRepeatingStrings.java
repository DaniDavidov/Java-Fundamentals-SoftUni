package textProcessingExercise;

import java.util.Objects;
import java.util.Scanner;

public class ReplaceRepeatingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scanner.nextLine());
        for (int i = 0; i < text.length() - 1; i++) {
            char currentSymbol = text.charAt(i);
            char nextSymbol = text.charAt(i+1);

            if (currentSymbol == nextSymbol) {
                text.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(text);
    }
}
