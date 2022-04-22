package listsExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class houseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commands = scanner.nextInt();
        List<String> guests = new ArrayList<>();

        for (int i = 0; i < commands; i++) {
            String[] data = scanner.nextLine().split(" ");
            String name = data[0];

            if (data[2].equals("not")) {
                if (guests.contains(name)) {
                    guests.remove(name);
                } else {
                    System.out.println(name + " is not in the list!");
                }
            } else {
                if (guests.contains(name)) {
                    System.out.println(name + " is already in the list!");
                } else {
                    guests.add(name);
                }
            }
        }
        guests.forEach(System.out::println);
    }
}
