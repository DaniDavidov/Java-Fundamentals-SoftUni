package methodsLab;

import java.util.Scanner;

public class calculateRectangeArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = rectangleArea(a, b);
        System.out.println(result);
    }

    static int rectangleArea(int width, int length) {
        return width * length;
    }
}
