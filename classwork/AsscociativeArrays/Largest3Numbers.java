package AsscociativeArrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sorted = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        sorted = sorted.stream()
                .sorted((n2, n1) -> n1.compareTo(n2))
                .limit(3)
                .collect(Collectors.toList());

        for (Integer integer : sorted) {
            System.out.print(integer + " ");
        }
    }
}
