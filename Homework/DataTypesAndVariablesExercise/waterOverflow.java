package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class waterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pours = Integer.parseInt(scanner.next());
        int sum = 0;

        for (int i = 0; i < pours; i++) {
            int litersPerPour = Integer.parseInt(scanner.next());
            if (sum + litersPerPour > 255) {
                System.out.println("Insufficient capacity!");
            } else {
                sum += litersPerPour;
            }
        }
        System.out.println(sum);
    }
}
