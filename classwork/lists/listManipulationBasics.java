package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class listManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toList();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] data = input.split(" ");
            String command = data[0];

            switch (command) {
                case "Add":

                    break;
                case "Remove":

                case "RemoveAt":

                case "Insert":

            }

            input = scanner.nextLine();
        }
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }



}
