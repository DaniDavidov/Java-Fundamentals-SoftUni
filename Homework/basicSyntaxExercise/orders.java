package basicSyntaxExercise;

import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        double totalSum = 0;

        for (int i = 0; i < N; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.next());
            int days = Integer.parseInt(scanner.next());
            int capsulesCount = Integer.parseInt(scanner.next());

            double sum = days * capsulesCount * pricePerCapsule;
            totalSum += sum;
            System.out.printf("The price for the coffee is: $%.2f%n", sum);
        }
        System.out.printf("Total: $%.2f", totalSum);
    }
}
