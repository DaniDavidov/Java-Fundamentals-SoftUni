package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class spiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yield = Integer.parseInt(scanner.nextLine());
        int storage = yield;
        int dayCounter = 0;
        int sum = 0;

        while (yield >= 100) {
            dayCounter++;
            sum += yield;
            sum -= 26;
            yield -= 10;
        }
        sum -= 26;
        System.out.println(dayCounter);
        System.out.println(sum);
    }
}
