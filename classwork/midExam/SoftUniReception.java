package midExam;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int emp1 = Integer.parseInt(scanner.next());
        int emp2 = Integer.parseInt(scanner.next());
        int emp3 = Integer.parseInt(scanner.next());
        int countOfStudents = Integer.parseInt(scanner.next());
        int studentsPerHour = emp1 + emp2 + emp3;
        int hourCounter = 0;
        int sum = 0;

        while (sum < countOfStudents) {
            hourCounter++;
            if (hourCounter > 0 && hourCounter % 4 == 0) {
                continue;
            }
            sum += studentsPerHour;
        }
        System.out.printf("Time needed: %dh.", hourCounter);
    }
}
