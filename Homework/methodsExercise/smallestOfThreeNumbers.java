package methodsExercise;

import java.util.Scanner;

public class smallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        getMin(n1, n2, n3);
    }
    static void getMin(int n1, int n2, int n3) {
        int[] array = new int[3];
        array[0] = n1;
        array[1] = n2;
        array[2] = n3;
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < min) min = i;
        }
        System.out.println(min);
    }
}
