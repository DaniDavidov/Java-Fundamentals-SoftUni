package AssociativeArraysExercise;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> products = new LinkedHashMap<>();

        String info = scanner.nextLine();
        while (!info.equals("buy")) {
            String[] data = info.split(" ");
            String productName = data[0];
            double price = Double.parseDouble(data[1]);
            double quantity = Double.parseDouble(data[2]);

            if (products.containsKey(productName)) {
                products.get(productName).set(0, price);
                products.get(productName).set(1, products.get(productName).get(1) + quantity);
            } else {
                products.put(productName, new ArrayList<>());
                products.get(productName).add(price);
                products.get(productName).add(quantity);
            }

            info = scanner.nextLine();
        }
        for (Map.Entry<String, List<Double>> entry : products.entrySet()) {
            double totalPrice = entry.getValue().get(0) * entry.getValue().get(1);
            System.out.printf("%s -> %.2f%n", entry.getKey(), totalPrice);
        }

    }
}
