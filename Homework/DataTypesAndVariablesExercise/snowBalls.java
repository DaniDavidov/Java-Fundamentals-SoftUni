package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class snowBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int bestSnowballSnow = 0;
        int bestSnowballTime = 0;
        int bestSnowballQuality = 0;
        double highestValue = 0;


        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(scanner.next());
            int snowballTime = Integer.parseInt(scanner.next());
            int snowballQuality = Integer.parseInt(scanner.next());

            double value = Math.pow((snowballSnow/ snowballTime), snowballQuality);
            if (value > highestValue) {
                highestValue = value;
                bestSnowballSnow = snowballSnow;
                bestSnowballTime = snowballTime;
                bestSnowballQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", bestSnowballSnow, bestSnowballTime,
                highestValue, bestSnowballQuality);
    }
}
