package ArraysExercises;

import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagons = scanner.nextInt();
        int[] train = new int[wagons];
        int sum = 0;

        for (int i = 0; i < train.length; i++) {
            train[i] = scanner.nextInt();
            sum += train[i];
        }
        for (int d : train) {
            System.out.print(d + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
