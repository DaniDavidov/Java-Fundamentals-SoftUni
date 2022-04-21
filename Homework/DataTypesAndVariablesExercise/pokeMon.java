package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class pokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pokePower = Integer.parseInt(scanner.next());
        int initialPower = pokePower;
        int distance = Integer.parseInt(scanner.next());
        int exhaustingFactor = Integer.parseInt(scanner.next());
        int pokedTargets = 0;

        while (pokePower >= distance) {
            pokePower -= distance;
            pokedTargets++;
            if (pokePower == 0.5 * initialPower && exhaustingFactor != 0) {
                pokePower /= exhaustingFactor;
            }
        }
        System.out.println(pokePower);
        System.out.println(pokedTargets);
    }
}
