package textProcessingExercise;

import java.util.Scanner;

public class ValidUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");

        for (String username : usernames) {
            if (username.length() >= 3 && username.length() <= 16) {
            }
        }
    }
}
