package methodsExercise;

import java.util.Scanner;

public class middleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        printMiddleCharacter(input);
    }

    public static void printMiddleCharacter(String txt) {
        if (txt.length() % 2 ==0) {
            System.out.print(txt.charAt(txt.length() / 2 - 1));
            System.out.println(txt.charAt(txt.length() / 2));
        } else {
            System.out.println(txt.charAt(txt.length() / 2));
        }
    }
}

