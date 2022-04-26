package textProcessingExercise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < inputText.length(); i++) {
            char symbol = inputText.charAt(i);
            text.append(String.format("%c", symbol + 3));
        }
        System.out.println(text.toString());
    }
}
