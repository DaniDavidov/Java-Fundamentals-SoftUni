package AssociativeArraysExercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> studentsByGrades = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (studentsByGrades.containsKey(studentName)) {
                studentsByGrades.get(studentName).add(grade);
            } else {
                studentsByGrades.put(studentName, new ArrayList<>());
                studentsByGrades.get(studentName).add(grade);
            }
        }

        for (Map.Entry<String, List<Double>> entry : studentsByGrades.entrySet()) {
            double averageGrade = 0;
            for (double g : entry.getValue()) {
                averageGrade += g;
            }
            averageGrade /= entry.getValue().size();
            if (averageGrade >= 4.50) {
                System.out.printf("%s -> %.2f%n", entry.getKey(), averageGrade);
            }
        }
    }
}
