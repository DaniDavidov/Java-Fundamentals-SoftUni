package textProcessingLab;

import java.util.Scanner;

public class textFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String bannedWord : bannedWords) {
            String replacement = replace(bannedWord, "*");
            text = text.replace(bannedWord, replacement);
        }
        System.out.println(text);
    }


    private static String replace(String bannedWord, String word) {
        String[] replacement = new String[bannedWord.length()];
        for (int i = 0; i < bannedWord.length(); i++) {
            replacement[i] = word;
        }
        return String.join("", replacement);
    }
}
