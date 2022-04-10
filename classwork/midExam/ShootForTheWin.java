package midExam;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] targets = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int count = 0;

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            int index = Integer.parseInt(command);
            if (index < targets.length && targets[index] > -1) {
                int indexInitialValue = targets[index];
                targets[index] = -1;
                count++;
                for (int i = 0; i < targets.length; i++) {
                    if (targets[i] > -1 && targets[i] > indexInitialValue) targets[i] -= indexInitialValue;
                    else if (targets[i] <= indexInitialValue && targets[i] > -1) targets[i] += indexInitialValue;
                }
            }

            command = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", count);
        for (int i : targets) {
            System.out.print(i + " ");
        }
    }
}
