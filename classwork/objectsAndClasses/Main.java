package objectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static class Student {
        String firstName;
        String lastName;
        int age;
        String city;

        Student(String firstName, String lastName, int age, String city) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
        }
        String getCity() {
            return this.city;
        }
        String getFirstName() {
            return this.firstName;
        }
        String getLastName() {
            return this.lastName;
        }
        int getAge() {
            return this.age;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] data = line.split(" ");
            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String city = data[3];

            Student existing = findStudent(students, firstName, lastName);
            if (existing == null) {
                Student student = new Student(firstName, lastName, age, city);
                students.add(student);
            } else  {
                existing.setAge(age);
                existing.setCity(city);
            }


            line = scanner.nextLine();
        }
        String wantedCity = scanner.nextLine();
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getCity().equals(wantedCity)) {
                System.out.printf("%s %s is %d years old%n",
                        s.getFirstName(), s.getLastName(), s.getAge());
            }
        }
    }

    private static Student findStudent(List<Student> students, String firstName, String lastName) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (firstName.equals(student.getFirstName())
                    && lastName.equals(student.getLastName())) {
                return student;
            }
        }
        return null;
    }
}
