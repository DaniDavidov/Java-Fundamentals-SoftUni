package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split("");
        Map<String, Integer> chars = new LinkedHashMap<>();

        for (String s : arr) {
            if (!s.equals(" ")) {
                if (chars.containsKey(s)) {
                    chars.put(s, chars.get(s) + 1);
                } else {
                    chars.put(s, 1);
                }
            }
        }
        for (Map.Entry<String, Integer> entry : chars.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
