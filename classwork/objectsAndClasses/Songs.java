package objectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
    static class Song {
        String type;
        String name;
        String time;

        Song(String type, String name, String time) {
            this.type = type;
            this.name = name;
            this.time = time;
        }
        String getType() {
            return this.type;
        }
        String getName() {
            return this.name;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Song> songs = new ArrayList<>();

        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] data = line.split(" ");

            String type = data[0];
            String name = data[1];
            String time = data[2];

            songs.add(new Song(type, name, time));

            line = scanner.nextLine();
        }
        String neededType = scanner.nextLine();

        if (neededType.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songs) {
                if (song.getType().equals(neededType)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
