package TextProcessingMoreExercises;

import java.util.Scanner;

public class ASCIIsumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String letter1 = scanner.nextLine();
        String letter2 = scanner.nextLine();
        int start = Math.min(letter1.charAt(0), letter2.charAt(0));
        int end = Math.max(letter1.charAt(0), letter2.charAt(0));
        StringBuilder sb = new StringBuilder(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < sb.length(); i++) {
            char symbol = sb.charAt(i);
            if (symbol > start && symbol < end) {
                sum += symbol;
            }
        }
        System.out.println(sum);
    }
}
