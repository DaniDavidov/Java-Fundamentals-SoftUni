package AssociativeArraysMoreExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MobaChallenger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> playerStatistics = new TreeMap<>();

        String line = scanner.nextLine();
        while (!line.equals("Season end")) {
            if (line.contains("->")) {
                String[] data = line.split(" -> ");
                String name = data[0];
                String position = data[1];

                int skill = Integer.parseInt(data[2]);
                updatePlayerStatistics(playerStatistics, name, position, skill);
            } else {
                String[] data = line.split(" vs ");
                String player1 = data[0];
                String player2 = data[1];
                handleDueling(playerStatistics, player1, player2);
            }


            line = scanner.nextLine();
        }

        TreeMap<String, Integer> playersWithTotalPoints = new TreeMap<>();
        sumPlayersPoints(playerStatistics, playersWithTotalPoints);

        printPlayers(playerStatistics, playersWithTotalPoints);

    }

    private static void printPlayers(Map<String, Map<String, Integer>> playerStatistics, TreeMap<String, Integer> playersWithTotalPoints) {

        playersWithTotalPoints.entrySet().stream()
                .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                .forEach(el -> {
                    System.out.printf("%s: %d skill%n", el.getKey(), el.getValue());
                    playerStatistics.get(el.getKey()).entrySet().stream()
                            .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                            .forEach(e -> System.out.printf("- %s <::> %d%n", e.getKey(), e.getValue()));
                });
    }


    public static void sumPlayersPoints(Map<String, Map<String, Integer>> playerStatistics,
                                        TreeMap<String, Integer> playersWithTotalPoints) {
        for (Map.Entry<String, Map<String, Integer>> entry : playerStatistics.entrySet()) {
            int totalPoints = 0;
            for (Map.Entry<String, Integer> position : entry.getValue().entrySet()) {
                totalPoints += position.getValue();
            }
            playersWithTotalPoints.putIfAbsent(entry.getKey(), totalPoints);
        }
    }

    // Method that decides which player has more skill
    // The player with less skill gets demoted/removed from the competition
    private static void handleDueling(Map<String, Map<String, Integer>> playerStatistics, String player1, String player2) {
        if (playerStatistics.containsKey(player1) && playerStatistics.containsKey(player2)) {
            int player1Wins = 0;
            int player2Wins = 0;
            for (Map.Entry<String, Integer> entry : playerStatistics.get(player1).entrySet()) {
                if (playerStatistics.get(player2).containsKey(entry.getKey())) {
                    if (entry.getValue() > playerStatistics.get(player2).get(entry.getKey())) {
                        player1Wins++;
                    } else if (entry.getValue() < playerStatistics.get(player2).get(entry.getKey())) {
                        player2Wins++;
                    }
                }
            }
            if (player1Wins > player2Wins) {
                playerStatistics.remove(player2);
            } else if (player2Wins > player1Wins) {
                playerStatistics.remove(player1);
            }
        }
    }


    public static void updatePlayerStatistics(
            Map<String, Map<String, Integer>> playerStatistics, String name, String position, int skill) {

        if (playerStatistics.containsKey(name)) {
            if (playerStatistics.get(name).containsKey(position)) {
                int currentSkill = playerStatistics.get(name).get(position);
                if (currentSkill < skill) {
                    playerStatistics.get(name).put(position, skill);
                }
            } else {
                playerStatistics.get(name).put(position, skill);
            }
        } else {
            playerStatistics.put(name, new LinkedHashMap<>());
            playerStatistics.get(name).put(position, skill);
        }
    }
}
