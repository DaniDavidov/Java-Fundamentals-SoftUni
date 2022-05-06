package AssociativeArraysMoreExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> contestsByParticipants = new LinkedHashMap<>();
        Map<String, Integer> usernamesByTotalPoints = new TreeMap<>();

        String line = scanner.nextLine();
        while (!line.equals("no more time")) {
            String[] data = line.split(" -> ");
            String name = data[0];
            String contest = data[1];
            int points = Integer.parseInt(data[2]);

            if (contestsByParticipants.containsKey(contest)) {
                Integer value = contestsByParticipants.get(contest).get(name);
                if (value != null) {
                    if (value < points) {
                        contestsByParticipants.get(contest).put(name, points);
                    }

                } else {
                    contestsByParticipants.get(contest).put(name, points);
                }

            } else {
                contestsByParticipants.put(contest, new TreeMap<>());
                contestsByParticipants.get(contest).put(name, points);
            }

            line = scanner.nextLine();
        }
        for (Map.Entry<String, Map<String, Integer>> entry : contestsByParticipants.entrySet()) {
            for (Map.Entry<String, Integer> username : entry.getValue().entrySet()) {
                Integer result = usernamesByTotalPoints.get(username.getKey());
                if (result != null) {
                    result += username.getValue();
                    usernamesByTotalPoints.put(username.getKey(), result);
                } else {
                    usernamesByTotalPoints.put(username.getKey(), username.getValue());
                }
            }

        }
        for (Map.Entry<String, Map<String, Integer>> entry : contestsByParticipants.entrySet()) {
            System.out.printf("%s: %d participants%n", entry.getKey(), entry.getValue().size());

            int[] count = {0};
            entry.getValue().entrySet().stream()
                    .sorted((n1, n2) -> n2.getValue().compareTo(n1.getValue()))
                    .forEach(el -> {
                        count[0]++;
                        System.out.printf("%d. %s <::> %d%n", count[0], el.getKey(), el.getValue());
                    });
        }

        System.out.println("Individual standings:");
        int[] count = {0};
        usernamesByTotalPoints.entrySet().stream()
                .sorted((n1, n2) -> n2.getValue().compareTo(n1.getValue()))
                .forEach(el -> {
                    count[0]++;
                    System.out.printf("%d. %s -> %d%n", count[0], el.getKey(), el.getValue());
                });

    }
}
