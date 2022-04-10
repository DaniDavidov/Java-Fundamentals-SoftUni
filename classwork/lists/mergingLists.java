package lists;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class mergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toList();
        List<Integer> input2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toList();
        int minSize = Math.min(input1.size(), input2.size());

        List<Integer> merged = new ArrayList<>();
        for (int i = 0; i < minSize; i++) {
            merged.add(input1.get(i));
            merged.add(input2.get(i));
        }
        if (input1.size() > input2.size()) {
            merged.addAll(Objects.requireNonNull(getTheRestOfElements(input2, input1)));
        } else {
            merged.addAll(getTheRestOfElements(input1, input2));
        }
        for (int i : merged) {
            System.out.print(i + " ");
        }
    }

    private static Collection<Integer> getTheRestOfElements(List<Integer> list1, List<Integer> list2) {
        List<Integer> restOfInts = new ArrayList<>();
        for (int i = list1.size(); i < list2.size(); i++) {
            restOfInts.add(list2.get(i));
        }
        return restOfInts;
    }


}
