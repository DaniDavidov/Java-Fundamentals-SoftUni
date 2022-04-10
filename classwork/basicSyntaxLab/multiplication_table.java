package basicSyntaxLab;

import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.next());
        int num2 = Integer.parseInt(scanner.next());

        if (num2 >= 10) {
            System.out.printf("%d X %d = %d%n", num, num2, num * num2);
        } else {
            for (int i = num2; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", num, i, num * i);
            }
        }
    }
}
