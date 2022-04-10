package basicSyntaxLab;

import java.util.Scanner;

public class passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.next());
        if (grade >= 3) {
            System.out.println("Passed!");
        }
    }
}
