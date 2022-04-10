package textProcessingLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        List<String> repeatList = new ArrayList<>();

        for (String s : input){
            repeatList.add(repeatString(s, s.length()));
        }
        System.out.println(String.join("", repeatList));
    }

    private static String repeatString(String s, int length) {
        String[] repeated = new String[length];

        for (int i = 0; i < length; i++) {
            repeated[i] = s;
        }
        return String.join("", repeated);
    }
}
