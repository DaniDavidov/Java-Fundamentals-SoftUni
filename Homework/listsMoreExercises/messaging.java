package listsMoreExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = List.of(scanner.nextLine().split(" "));
        String text = scanner.nextLine();
        List<Character> message = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int sum = 0;
            String element = list.get(i);
            int[] numbers = Arrays.stream(element.split(""))
                    .mapToInt(Integer::parseInt).toArray();
            for (int j : numbers) {
                sum += j;
            }
            if (sum >= text.length()) {
                sum = sum - (text.length()+1);
            }
            message.add(text.charAt(sum));
        }
        for (char c : message) {
            System.out.print(c + "");
        }
    }
}
