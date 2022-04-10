package basicSyntaxLab;

import java.util.Scanner;

public class refactor_sum_of_odd_nums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int sum = 0;
        int num = 1;

        for (int i = 1; i <= n; i++) {
            sum += num;
            System.out.println(num);
            num += 2;
        }
        System.out.println("Sum: " + sum);
    }
}
