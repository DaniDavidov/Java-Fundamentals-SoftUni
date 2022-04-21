package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class topIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        int[] intArr = new int[array.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(array[i]);
        }
        boolean isBigger;
        for (int i = 0; i < intArr.length; i++) {
            isBigger = false;
            for (int j = i+1; j < intArr.length; j++) {
                if (intArr[i] > intArr[j]) {
                    isBigger = true;
                } else {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) System.out.print(intArr[i] + " ");

        }
        System.out.println(intArr[intArr.length-1]);
    }
}
