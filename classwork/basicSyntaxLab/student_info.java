package basicSyntaxLab;

import java.util.Scanner;

public class student_info {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.next());
        double grade = Double.parseDouble(scanner.next());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, grade);
    }
}