package methodsExercise;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class arrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] data = line.split(" ");
            String command = data[0];

            switch (command) {
                case "exchange":
                    int index = Integer.parseInt(data[1]);
                    if (indexIsValid(index, inputArr.length)) {
                        exchange(inputArr, index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    if (data[1].equals("even")) {
                        printEvenMaxNumIndex(inputArr);
                    } else if (data[1].equals("odd")){
                        printOddMaxNumIndex(inputArr);
                    }
                    break;
                case "min":
                    if (data[1].equals("even")) {
                        printEvenMinNumIndex(inputArr);
                    } else if (data[1].equals("odd")){
                        printOddMinNumIndex(inputArr);
                    }
                    break;
                case "first":
                    int count = Integer.parseInt(data[1]);
                    if (count > inputArr.length) System.out.println("Invalid count");
                    if (data[2].equals("even")) {
                        printFirstEvenNums(inputArr, count);
                    } else if(data[2].equals("odd")) {

                    }
                    break;
                case "last":

                    break;
            }
            line = scanner.nextLine();
        }
    }
    public static boolean indexIsValid(int index, int arrayLength) {
        return arrayLength > index;
    }

    public static void exchange(int[] array, int index) {
        int[] firstPart = new int[index+1];
        int[] secondPart = new int[array.length-index-1];

        for (int i = 0; i < firstPart.length; i++) {
            firstPart[i] = array[i];
        }
        for (int i = 0; i < secondPart.length; i++) {
            secondPart[i] = array[firstPart.length + i];
        }
        for (int i = 0; i < array.length; i++) {
            if (i < secondPart.length) {
                array[i] = secondPart[i];
            } else {
                array[i] = firstPart[i - secondPart.length];
            }
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
    public static void printEvenMaxNumIndex(int[] array) {
        int maxNum = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] >= maxIndex) {
                maxNum = array[i];
                maxIndex = i;
            }
        }
        if (maxNum == Integer.MIN_VALUE) System.out.println("No matches");
        else System.out.println(maxIndex);

    }
    public static void printOddMaxNumIndex(int[] array) {
        int maxNum = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && array[i] >= maxIndex) {
                maxNum = array[i];
                maxIndex = i;
            }
        }
        if (maxNum == Integer.MIN_VALUE) System.out.println("No matches");
        else System.out.println(maxIndex);
    }
    public static void printEvenMinNumIndex(int[] array) {
        int minNum = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] <= minIndex) {
                minNum = array[i];
                minIndex = i;
            }
        }
        if (minNum == Integer.MAX_VALUE) System.out.println("No matches");
        else System.out.println(minIndex);
    }
    public static void printOddMinNumIndex(int[] array) {
        int minNum = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && array[i] <= minIndex) {
                minNum = array[i];
                minIndex = i;
            }
        }
        if (minNum == Integer.MAX_VALUE) System.out.println("No matches");
        else System.out.println(minIndex);
    }

    public static void printFirstEvenNums(int[] array, int count) {
        int numbers = 0;
        int[] firstEvenNumbers = new int[count];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {

            }
        }
    }
}
