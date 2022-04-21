package methodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class palindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String[] originalNum = command.split("");
            String[] reversedNum = reverseNumber(command);
            System.out.println(numbersAreEqual(originalNum, reversedNum));

            command = scanner.nextLine();
        }
    }


    static String[] reverseNumber(String command) {
        String[] reversedNumArray = command.split("");
        for (int i = 0; i < reversedNumArray.length / 2; i++) {
            String firstDigit = reversedNumArray[i];
            String lastDigit = reversedNumArray[reversedNumArray.length - 1 - i];
            reversedNumArray[i] = lastDigit;
            reversedNumArray[reversedNumArray.length - 1 - i] = firstDigit;

        }
        return reversedNumArray;
    }
    static boolean numbersAreEqual(String[] n1, String[] n2) {
        return Arrays.equals(n1, n2);
    }

}
