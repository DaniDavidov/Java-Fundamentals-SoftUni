package methodsExercise;

import java.util.Scanner;

public class topNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            String stringNum = i + "";
            if (sumOfNumisDivisibleBy8(stringNum) && holdsOddNum(stringNum)) {
                System.out.println(i);
            }
        }
    }

    public static boolean sumOfNumisDivisibleBy8(String num) {
        int sumOfNum = 0;
        for (int i = 0; i < num.length(); i++) {
            sumOfNum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        return sumOfNum % 8 == 0;
    }

    public static boolean holdsOddNum(String num) {
        boolean numHasOddDigit = false;
        for (int i = 0; i < num.length(); i++) {
            int valueOfChar = Integer.parseInt(String.valueOf(num.charAt(i)));
            if (valueOfChar % 2 != 0) numHasOddDigit = true;
        }
        return numHasOddDigit;
    }

}
