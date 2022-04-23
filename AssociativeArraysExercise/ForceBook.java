package AssociativeArraysExercise;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Map<String, List<String>> users = new LinkedHashMap<>();

        while (!line.equals("Lumpawaroo")) {

            if (line.contains("|")) {
                String[] data = line.split("\\s+\\|\\s+");
                String side = data[0];
                String username = data[1];
                users.putIfAbsent(side, new ArrayList<>());
                boolean noneMatch = users.get(side).stream()
                        .noneMatch(user -> user.contains(username));
                if (noneMatch) {
                    users.get(side).add(username);
                }

            } else if (line.contains("->")) {
                String[] data = line.split("\\s+->\\s+");
                String side = data[1];
                String username = data[0];

                users.forEach((k, v) -> v.remove(username));
                users.putIfAbsent(side, new ArrayList<>());
                users.get(side).add(username);
                System.out.printf("%s joins the %s side!%n", username, side);
            }


            line = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : users.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                entry.getValue().forEach(e -> System.out.printf("! %s%n", e));
            }
        }

    }
}
