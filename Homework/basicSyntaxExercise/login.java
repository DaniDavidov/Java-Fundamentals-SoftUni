package basicSyntaxExercise;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String password = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            password += input.charAt(i);
        }
        int attempts = 0;
        String text = scanner.nextLine();
        while (true) {
            attempts++;
            if (attempts == 4) {
                System.out.printf("User %s blocked!", input);
                break;
            }
            if (text.equals(password)) {
                System.out.printf("User %s logged in.", input);
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
            }

            text = scanner.nextLine();
        }
    }
}