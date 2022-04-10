package midExam;

import java.util.Arrays;
import java.util.Scanner;

public class heartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] neighborhood = Arrays.stream(scanner.nextLine().split("@"))
                .mapToInt(Integer::parseInt).toArray();
        boolean missionSuccessful = true;
        int failedCount = 0;
        int index = 0;
        int lastPosition = 0;

        String line = scanner.nextLine();
        while (!line.equals("Love!")) {
            String[] data = line.split(" ");
            String command = data[0];
            int jumpLength = Integer.parseInt(data[1]);
            index += jumpLength;
            if (index >= neighborhood.length) {
                index = 0;
            }
            lastPosition = index;
            neighborhood[index] -= 2;
            if (neighborhood[index] == 0) {
                System.out.printf("Place %d has Valentine's day.%n", index);
            } else if (neighborhood[index] < 0) {
                System.out.printf("Place %d already had Valentine's day.%n", index);
            }

            line = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", lastPosition);
        for (int i : neighborhood) {
            if (i > 0) {
                missionSuccessful = false;
                failedCount++;
            }
        }
        if (missionSuccessful) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.%n", failedCount);
        }
    }
}
