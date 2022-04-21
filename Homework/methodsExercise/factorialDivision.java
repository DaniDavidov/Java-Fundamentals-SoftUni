package methodsExercise;

import java.util.Scanner;

public class factorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.next());
        int n2 = Integer.parseInt(scanner.next());

        double firstFactorial = factorialOfFirstNum(n1);
        double secondFactorial = factorialOfSecondNum(n2);
        double result = firstFactorial / secondFactorial;
        System.out.printf("%.2f", result);
    }
    static int factorialOfFirstNum(int number) {
        int sum = 1;
        for (int i = 1; i <= number; i++) {
            sum *= i;
        }
        return sum;
    }
    static int factorialOfSecondNum(int number) {
        int sum = 1;
        for (int i = 1; i <= number; i++) {
            sum *= i;
        }
        return sum;
    }
}
