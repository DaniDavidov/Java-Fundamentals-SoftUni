package methodsLab;

import java.util.Scanner;

public class mathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int n2 = Integer.parseInt(scanner.nextLine());

        int result = mathCalculations(operator, n1, n2);
        System.out.println(result);
    }

    static int mathCalculations(String operator, int n1, int n2) {
        switch (operator) {
            case "/":
                return n1 / n2;
            case "*":
                return n1 * n2;
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
        }
        return 0;
    }
}
