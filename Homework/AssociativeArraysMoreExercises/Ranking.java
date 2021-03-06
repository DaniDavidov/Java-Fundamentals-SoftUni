package AssociativeArraysMoreExercises;

import java.util.*;
import java.util.stream.Collectors;

public class Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> contestsByPassword = new LinkedHashMap<>();
        String line = scanner.nextLine();
        while (!line.equals("end of contests")) {
            String[] data = line.split(":");

            contestsByPassword.put(data[0], data[1]);

            line = scanner.nextLine();
        }
        String line2 = scanner.nextLine();
        Map<String, Map<String, Integer>> candidatesByPoints = new TreeMap<>();
        while (!line2.equals("end of submissions")) {
            String[] data = line2.split("=>");
            String contest = data[0];
            String pass = data[1];
            String username = data[2];
            int points = Integer.parseInt(data[3]);

            if (contestsByPassword.containsKey(contest) && contestsByPassword.get(contest).equals(pass)) {
                candidatesByPoints.putIfAbsent(username, new LinkedHashMap<>());
                candidatesByPoints.get(username).putIfAbsent(contest, 0);
                if (candidatesByPoints.get(username).get(contest) < points) {
                    candidatesByPoints.get(username).put(contest, points);
                }
            }

            line2 = scanner.nextLine();
        }
        String bestCandidate = "";
        int mostPoints = 0;
        for (Map.Entry<String, Map<String, Integer>> candidate : candidatesByPoints.entrySet()) {
            int pointsSum = 0;
            for (Map.Entry<String, Integer> contest : candidate.getValue().entrySet()) {
                pointsSum += contest.getValue();
            }
            if (pointsSum > mostPoints) {
                bestCandidate = candidate.getKey();
                mostPoints = pointsSum;
            }
        }
        System.out.printf("Best candidate is %s with total %d points.%n", bestCandidate, mostPoints);
        System.out.println("Ranking:");
        for (Map.Entry<String, Map<String, Integer>> user : candidatesByPoints.entrySet()) {
            System.out.println(user.getKey());
            user.getValue().entrySet().stream().sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                    .forEach((score) -> System.out.printf("#  %s -> %d%n", score.getKey(), score.getValue()));

        }

    }
}
