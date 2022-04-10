package textProcessingLab;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatString2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");
        List<String> repeatedList = new ArrayList<>();
        for (String s : words) {
            repeatedList.add(repeatWord(s, words.length));
        }
        System.out.println(String.join("", repeatedList));
    }

    private static String repeatWord(String word, int repetitions) {
        char[] repeated = new char[word.length() * repetitions];
        for (int i = 0; i < repeated.length; i++) {
            repeated[i] = word.charAt(i % word.length());
        }
        return new String(repeated);
    }
}
