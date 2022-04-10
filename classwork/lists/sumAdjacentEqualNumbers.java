package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class sumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        for (String s : input) {
            numbers.add(Double.parseDouble(s));
        }

        List<Double> nums = sumEqualNumbers(numbers);
        while (nums.size() != numbers.size()) {
            numbers = nums;
            nums = sumEqualNumbers(numbers);
        }
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }
    }

    private static List<Double> sumEqualNumbers(List<Double> numbers) {
        List<Double> nums = new ArrayList<>();
        int i = 0;
        while (i < numbers.size()){
            if (i < numbers.size() -1 && Objects.equals(numbers.get(i), numbers.get(i + 1))) {
                nums.add((numbers.get(i) + numbers.get(i+1)));
                i += 2;
            } else {
                 nums.add(numbers.get(i));
                i++;
            }
        }
        return nums;
    }
}
