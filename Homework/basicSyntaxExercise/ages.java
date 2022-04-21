package basicSyntaxExercise;

import java.util.Scanner;

public class ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.next());

        if (num < 3) {
            System.out.println("baby");
        } else if (num < 14) {
            System.out.println("child");
        } else if (num < 20) {
            System.out.println("teenager");
        } else if (num < 66) {
            System.out.println("adult");
        } else {
            System.out.println("elder");
        }
    }
}
