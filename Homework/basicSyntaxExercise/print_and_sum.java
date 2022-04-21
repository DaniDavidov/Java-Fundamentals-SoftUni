package basicSyntaxExercise;

import java.util.Scanner;

public class print_and_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNum = Integer.parseInt(scanner.next());
        int endNum = Integer.parseInt(scanner.next());
        int sum = 0;

        for (int i = startNum; i <= endNum; i++) {
            System.out.println(i + " ");
            sum += i;
        }
        System.out.printf("Sum: %d%n", sum);
    }
}
