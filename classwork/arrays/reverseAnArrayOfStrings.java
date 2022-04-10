package arrays;
import java.util.Scanner;

public class reverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i];
        }

        for (int i = 0; i < array.length / 2; i++) {
            String firstString = array[i];
            String otherString = array[array.length - i - 1];
            array[i] = otherString;
            array[array.length - i - 1] = firstString;
        }
        for (String j : array) {
            System.out.print(j + " ");
        }
    }
}
