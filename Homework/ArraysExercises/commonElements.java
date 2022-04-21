package ArraysExercises;

import java.util.Scanner;

public class commonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr1 = scanner.nextLine().split(" ");
        String[] arr2 = scanner.nextLine().split(" ");

        for (String s : arr1) {
            for (String value : arr2) {
                if (s.equals(value)) {
                    System.out.print(s + " ");
                }
            }
        }
    }
}
