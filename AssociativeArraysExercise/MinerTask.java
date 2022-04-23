package AssociativeArraysExercise;

import java.util.*;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> data = new ArrayList<>();

        String command = scanner.nextLine();
        while (!command.equals("stop")) {
            data.add(command);
            command = scanner.nextLine();
        }

        Map<String, Integer> resources = new LinkedHashMap<>();
        for (int i = 0; i < data.size(); i++) {
            String resource = data.get(i);
            int quantity = Integer.parseInt(data.get(i+1));

            if (i % 2 == 0 && !resources.containsKey(resource)) {
                resources.put(resource, quantity);
            } else if (i % 2 == 0 && resources.containsKey(resource)) {
                resources.put(resource, resources.get(resource) + quantity);
            }
            i++;
        }
        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
