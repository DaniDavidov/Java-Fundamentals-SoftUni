package basicSyntaxExercise;

import java.util.Scanner;

public class strong_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        int originalNum = num;
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            int digit = num % 10;
            num /= 10;
            int factorial = 1;

            for (int j = 1; j <= digit; j++) {
                factorial *= j;
            }
            sum += factorial;
        }
        if (originalNum == sum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
