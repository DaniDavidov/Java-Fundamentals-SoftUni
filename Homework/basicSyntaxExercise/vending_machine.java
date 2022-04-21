package basicSyntaxExercise;

import java.util.Scanner;

public class vending_machine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double[] typeOfCoins = {0.1, 0.2, 0.5, 1.0, 2.0};
        boolean isValid = false;
        double price = 0;

        String command = scanner.nextLine();
        while (!command.equals("Start")) {
            double coins = Double.parseDouble(command);
            for (double i : typeOfCoins) {

                if (i == coins) {
                    isValid = true;
                    break;
                } else {
                    isValid = false;
                }
            }
            if (isValid) {
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            command = scanner.nextLine();
        }
        String product = scanner.nextLine();
        while (!product.equals("End")) {
            switch (product) {
                case "Nuts":
                    price = 2.0;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1.0;
                    break;
                default:
                    System.out.println("Invalid Product");
                    continue;
            }
            if (sum >= price) {
                sum -= price;
                System.out.printf("Purchased %s%n", product);
            } else {
                System.out.println("Sorry, not enough money");
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);

    }
}
