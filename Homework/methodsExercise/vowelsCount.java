package methodsExercise;

import java.util.Locale;
import java.util.Scanner;

public class vowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        countTheVowels(input);
    }
    public static void countTheVowels(String text) {
        String word = text.toLowerCase(Locale.ROOT);
        char[] vowels = {'a', 'e', 'o', 'u', 'i'};
        int vowelsCounter = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (word.charAt(i) == vowels[j]) {
                    vowelsCounter++;
                }
            }
        }
        System.out.println(vowelsCounter);
    }
}
