package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class integersOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.next());
        int n2 = Integer.parseInt(scanner.next());
        int n3 = Integer.parseInt(scanner.next());
        int n4 = Integer.parseInt(scanner.next());

        int result = ((n1 + n2) / n3) * n4;
        System.out.println(result);
    }
}
