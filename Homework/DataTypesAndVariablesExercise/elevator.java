package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int p = Integer.parseInt(scanner.next());

        int result = (int) Math.ceil((double) n / p);
        System.out.println(result);
    }
}
