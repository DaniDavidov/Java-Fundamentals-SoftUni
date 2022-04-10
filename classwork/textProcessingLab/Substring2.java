package textProcessingLab;

import java.util.Scanner;

public class Substring2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // here is an implementation with kind of faster speed

        String removeWord = scanner.nextLine();
        String text = scanner.nextLine();
        int removeIndex = text.indexOf(removeWord);

        while (removeIndex != -1) {
            text = text.replace(removeWord, "");
            removeIndex = text.indexOf(removeWord);
        }
        System.out.println(text);
    }
}
