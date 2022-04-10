package arrays;

import java.util.Scanner;

public class dayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (n > 7 || n < 1) {
            System.out.println("Invalid day!");
        } else {
            System.out.println(days[n - 1]);
        }
    }
}
