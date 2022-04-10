package textProcessingLab;

import java.util.Locale;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] reversed = new String[input.length()];

            for (int i = 0; i < input.length(); i++) {
                reversed[i] = String.valueOf(input.charAt(input.length() - 1 - i));
            }
            String reversedString = String.join("", reversed);
            System.out.println(input + " = " + reversedString);
            input = scanner.nextLine();
        }

    }
}
