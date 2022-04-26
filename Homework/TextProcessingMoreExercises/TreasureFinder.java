package TextProcessingMoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] key = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        String line = scanner.nextLine();
        while (!line.equals("find")) {
            StringBuilder info = new StringBuilder(line);
            int keyPointer = 0;
            int stringPointer = 0;

            while (stringPointer <= info.length() - 1) {
                if (keyPointer < key.length) {
                    char currentChar = info.charAt(stringPointer);
                    char newChar = (char) (currentChar - key[keyPointer]);

                    info.setCharAt(stringPointer, newChar);
                    keyPointer++;
                    stringPointer++;
                } else {
                    keyPointer = 0;
                }
            }

            String type = info.substring(info.indexOf("&") + 1, info.lastIndexOf("&"));
            String coordinates = info.substring(info.indexOf("<") + 1, info.indexOf(">"));
            System.out.printf("Found %s at %s%n", type, coordinates);

            line = scanner.nextLine();
        }
    }
}
