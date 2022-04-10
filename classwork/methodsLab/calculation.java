package methodsLab;

import java.util.Scanner;

public class calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        calculate(operation, n1, n2);
    }
    public static void calculate(String operation, int n1, int n2) {
        switch (operation) {
            case "add":
                System.out.println(n1 + n2);
                break;
            case "multiply":
                System.out.println(n1 * n2);
                break;
            case "subtract":
                System.out.println(n1 - n2);
                break;
            case "divide":
                System.out.println(n1 / n2);
                break;
        }
    }
}
