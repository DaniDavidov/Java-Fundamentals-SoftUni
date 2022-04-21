package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class beerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        String biggestKeg = "";
        double highestValue = 0;

        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.next());
            int height = Integer.parseInt(scanner.next());

            double volume = Math.PI * Math.pow(radius, 2) * height;
            if (volume >= highestValue) {
                highestValue = volume;
                biggestKeg = model;
            }
        }
        System.out.println(biggestKeg);
    }
}
