package basicSyntaxLab;

import java.util.Scanner;

public class even_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = Integer.parseInt(scanner.next());

            if (number % 2 == 0) {
                System.out.println("The number is: " + Math.abs(number));
                break;
            } else {
                System.out.println("Please write an even number.");
            }
        }
    }
}
