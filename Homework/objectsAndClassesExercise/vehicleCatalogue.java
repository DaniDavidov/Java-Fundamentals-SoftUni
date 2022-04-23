package objectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class vehicleCatalogue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehicleList = new ArrayList<>();

        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] data = line.split(" ");
            Vehicle vehicle = new Vehicle(data[0], data[1], data[2], Integer.parseInt(data[3]));
            vehicleList.add(vehicle);

            line = scanner.nextLine();
        }

        line = scanner.nextLine();
        while (!line.equals("Close the Catalogue")) {
            String modelName = line;
            vehicleList.stream().filter(vehicle -> vehicle.getModel().equals(modelName))
                    .forEach(vehicle -> System.out.println(vehicle.toString()));


            line = scanner.nextLine();
        }
        List<Vehicle> cars = vehicleList.stream().filter(vehicle -> vehicle.getType().equals("car"))
                .collect(Collectors.toList());
        List<Vehicle> trucks = vehicleList.stream().filter(vehicle -> vehicle.getType().equals("truck"))
                .collect(Collectors.toList());
        double avgCarsHp = avgHp(cars);
        double avgTruckHp = avgHp(trucks);

        System.out.printf("Cars have average horsepower of: %.2f.%n", avgCarsHp);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", avgTruckHp);
    }
    static double avgHp(List<Vehicle> vehicle) {
        if (vehicle.size() == 0) {
            return 0;
        } else {
            return vehicle.stream().mapToDouble(Vehicle::getHorsePower).sum() / vehicle.size();
        }
    }

    static class Vehicle {
        String type;
        String model;
        String color;
        int horsePower;

        public String getModel() {
            return model;
        }
        public String getType() {
            return type;
        }
        public int getHorsePower() {
            return horsePower;
        }

        public Vehicle(String type, String model, String color, int horsePower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return String.format("Type: %s%n" +
                    "Model: %s%n" +
                    "Color: %s%n" +
                    "Horsepower: %d", getType().toUpperCase(Locale.ROOT).charAt(0) + getType().substring(1), this.model, this.color, this.horsePower);
        }
    }
}
