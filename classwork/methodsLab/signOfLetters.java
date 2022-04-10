package methodsLab;

import java.util.Scanner;

public class signOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sign(scanner.nextDouble());
    }
    public static void sign(double n) {
        if (2.00 <= n && n < 3.00) System.out.println("Fail");
        else if (n < 3.50) System.out.println("Poor");
        else if (n < 4.50) System.out.println("Good");
        else if (n < 5.50) System.out.println("Very good");
        else if (n < 6.00) System.out.println("Excellent");
    }

}
