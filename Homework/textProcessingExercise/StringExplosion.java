package textProcessingExercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());
        int power = 0;
        for (int i = 0; i < sb.length(); i++) {
            char symbol = sb.charAt(i);
            if (power > 0 && symbol != '>') {
                sb.deleteCharAt(i);
                power--;
                i--;
            } else if (symbol == '>') {
                power += Integer.parseInt(String.valueOf(sb.charAt(i+1)));
            }
        }
        System.out.println(sb);
    }
}
