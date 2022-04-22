package listsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] data = line.split("\\s+");
            String command = data[0];

            switch (command) {
                case "Delete":
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) == Integer.parseInt(data[1])) {
                            numbers.remove(numbers.get(i));
                        }
                    }

                    break;
                case "Insert":
                    int index = Integer.parseInt(data[2]);
                    int element = Integer.parseInt(data[1]);

                    numbers.add(index, element);

                    break;
            }

            line = scanner.nextLine();
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
         }
    }
}
