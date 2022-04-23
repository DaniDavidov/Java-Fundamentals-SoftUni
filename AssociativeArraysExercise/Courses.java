package AssociativeArraysExercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> coursesData = new LinkedHashMap<>();

        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] data = line.split(" : ");
            String courseName = data[0];
            String student = data[1];

            if (coursesData.containsKey(courseName)) {
                coursesData.get(courseName).add(student);
            } else {
                coursesData.put(courseName, new ArrayList<>());
                coursesData.get(courseName).add(student);
            }

            line = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : coursesData.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
            for (String name : entry.getValue()) {
                System.out.println("-- " + name);
            }
        }

    }
}
