package listsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class cardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> hand1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> hand2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int i = 0;
        while (hand1.size() > 0 && hand2.size() > 0) {
            if (hand1.get(i) > hand2.get(i)) {
                hand1.add(hand1.get(i));
                hand1.add(hand2.get(i));
                hand1.remove(i);
                hand2.remove(i);
            } else if (hand1.get(i) < hand2.get(i)) {
                hand2.add(hand2.get(i));
                hand2.add(hand1.get(i));
                hand2.remove(i);
                hand1.remove(i);
            } else {
                hand1.remove(i);
                hand2.remove(i);
            }
        }
        int sum = 0;
        if (hand1.size() > hand2.size()) {
            for (Integer integer : hand1) {
                sum+=integer;
            }
            System.out.println("First player wins! Sum: " + sum);
        } else {
            for (Integer integer : hand2) {
                sum+=integer;
            }
            System.out.println("Second player wins! Sum: " + sum);
        }
    }
}
