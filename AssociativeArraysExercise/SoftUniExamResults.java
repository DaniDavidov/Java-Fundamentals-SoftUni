package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> usersByPoints = new LinkedHashMap<>();
        Map<String, Integer> submissionsPerLanguage = new LinkedHashMap<>();

        String line = scanner.nextLine();
        while (!line.equals("exam finished")) {
            String[] data = line.split("-");
            String username = data[0];

            if (data[1].equals("banned")) usersByPoints.remove(username);
            else {
                usersByPoints.putIfAbsent(username, Integer.parseInt(data[2]));
                submissionsPerLanguage.putIfAbsent(data[1], 0);
                submissionsPerLanguage.put(data[1], submissionsPerLanguage.get(data[1]) + 1);
            }


            line = scanner.nextLine();
        }
        System.out.println("Results:");
        usersByPoints.forEach((k, v) -> System.out.printf("%s | %d%n", k, v));
        System.out.println("Submissions:");
        submissionsPerLanguage.forEach((k, v) -> System.out.printf("%s - %d%n", k, v));
    }
}
