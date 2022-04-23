package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean hasWinner = false;
        String winner = "";
        Map<String, Integer> itemsByFragments = new LinkedHashMap<>();
        itemsByFragments.put("shards", 0);
        itemsByFragments.put("fragments", 0);
        itemsByFragments.put("motes", 0);

        while (!hasWinner) {
            String[] data = scanner.nextLine().split("\\s+");

            for (int i = 0; i < data.length - 1; i+=2) {
                int quantity = Integer.parseInt(data[i]);
                String resource = data[i+1].toLowerCase(Locale.ROOT);
                itemsByFragments.putIfAbsent(resource, 0);
                itemsByFragments.put(resource, itemsByFragments.get(resource) + quantity);

                if (resource.equals("shards")
                        || resource.equals("fragments") || resource.equals("motes")) {

                    if (itemsByFragments.get(resource) >= 250) {
                        itemsByFragments.put(resource, itemsByFragments.get(resource) - 250);
                        winner = resource;
                        hasWinner = true;
                        break;
                    }
                }
            }
        }
        switch (winner) {
            case "shards":
                System.out.println("Shadowmourne obtained!");
                break;
            case "fragments":
                System.out.println("Valanyr obtained!");
                break;
            case "motes":
                System.out.println("Dragonwrath obtained!");
                break;
        }
        for (Map.Entry<String, Integer> entry : itemsByFragments.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
    }
}
