package AssociativeArraysExercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, List<String>> companiesById = new LinkedHashMap<>();

        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] data = line.split(" -> ");
            String companyName = data[0];
            String id = data[1];

            if (companiesById.containsKey(companyName)) {
                boolean isUnique = true;
                for (int i = 0; i < companiesById.get(companyName).size(); i++) {
                    if (companiesById.get(companyName).get(i).equals(id)) {
                        isUnique = false;
                        break;
                    }
                }
                if (isUnique) companiesById.get(companyName).add(id);
            } else {
                companiesById.put(companyName, new ArrayList<>());
                companiesById.get(companyName).add(id);
            }

            line = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : companiesById.entrySet()) {
            System.out.println(entry.getKey());
            for (String s : entry.getValue()) {
                System.out.println("-- " + s);
            }
        }

    }
}
