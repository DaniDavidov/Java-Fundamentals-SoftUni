package basicSyntaxExercise;

import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.next());
        int divisibleNum = 0;

        if (number % 10 == 0) {
            divisibleNum = 10;
        } else if (number % 7 == 0) {
            divisibleNum = 7;
        } else if (number % 6 == 0) {
            divisibleNum = 6;
        } else if (number % 3 == 0) {
            divisibleNum = 3;
        } else if (number % 2 == 0) {
            divisibleNum = 2;
        }
        if (divisibleNum == 0) {
            System.out.println("Not divisible");
        } else {
            System.out.println("The number is divisible by " + divisibleNum);
        }
    }
}
