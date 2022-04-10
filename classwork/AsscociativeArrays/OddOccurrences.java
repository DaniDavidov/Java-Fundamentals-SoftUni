package AsscociativeArrays;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        Map<String, Integer> wordsMap = new LinkedHashMap<>();

        for (String s : words) {
            String wordInLowerCase = s.toLowerCase();

            if (wordsMap.containsKey(wordInLowerCase)) {
                wordsMap.put(wordInLowerCase, wordsMap.get(wordInLowerCase) + 1);
            } else {
                wordsMap.put(wordInLowerCase, 1);
            }
        }
        List<String> occurrences = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                occurrences.add(entry.getKey());
            }
        }
        for (int i = 0; i < occurrences.size(); i++) {
            System.out.print(occurrences.get(i));
            if (i < occurrences.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
