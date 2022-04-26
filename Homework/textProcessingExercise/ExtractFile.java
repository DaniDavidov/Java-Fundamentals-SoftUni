package textProcessingExercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filePath = scanner.nextLine();
        String[] data = filePath.substring(filePath.lastIndexOf("\\") + 1).split("\\.");
        System.out.println("File name: " + data[0]);
        System.out.println("File extension: " + data[1]);
    }
}
