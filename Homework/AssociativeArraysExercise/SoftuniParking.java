package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SoftuniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> users = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            String command = data[0];
            String user = data[1];

            switch (command) {
                case "register":
                    if (!users.containsKey(user)) {
                        users.put(user, data[2]);
                        System.out.printf("%s registered %s successfully%n", user, data[2]);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n",users.get(user));
                    }
                    break;
                case "unregister":
                    if (!users.containsKey(user)) {
                        System.out.printf("ERROR: user %s not found%n", user);
                    } else {
                        users.remove(user);
                        System.out.println(user + " unregistered successfully");
                    }
                    break;
            }
        }
        for (Map.Entry<String, String> entry : users.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
    }
}
