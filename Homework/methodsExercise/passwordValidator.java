package methodsExercise;

import java.util.Locale;
import java.util.Scanner;

public class passwordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (passUpTo10Chars(input) && onlyLettersAndDigits(input) && has2Digits(input)) {
            System.out.println("Password is valid");
        }
        if (!passUpTo10Chars(input)) System.out.println("Password must be between 6 and 10 characters");
        if (!onlyLettersAndDigits(input)) System.out.println("Password must consist only of letters and digits");
        if (!has2Digits(input)) System.out.println("Password must have at least 2 digits");
    }

    public static boolean passUpTo10Chars(String txt) {
        return 6 <= txt.length() && txt.length() <= 10;
    }
    public static boolean onlyLettersAndDigits(String txt) {
        String pass = txt.toLowerCase(Locale.ROOT);
        for (int i = 0; i < pass.length(); i++) {
            char symbol = pass.charAt(i);
            if ((symbol < 48 || symbol > 57) && (symbol < 97 || symbol > 122)) {
                return false;
            }
        }
        return true;
    }
    public static boolean has2Digits(String txt) {
        int counter = 0;
        for (int i = 0; i < txt.length(); i++) {
            char symbol = txt.charAt(i);
            if (symbol >= 48 && symbol <= 57) {
                counter++;
            }
        }
        return counter >= 2;
    }
}
