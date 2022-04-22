package listsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class bombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String[] line = scanner.nextLine().split(" ");
        int bomb = Integer.parseInt(line[0]);
        int power = Integer.parseInt(line[1]);

        while (numbers.contains(bomb)) {
            int bombIndex = numbers.indexOf(bomb);
            int start = Math.max(bombIndex - power, 0);
            int end = Math.min(bombIndex + power, numbers.size()-1);
            for (int i = start; i <= end; i++) {
                numbers.remove(start);
            }
        }
        int sum = 0;
        for (Integer i : numbers) {
            sum += i;
        }
        System.out.println(sum);
    }
}
