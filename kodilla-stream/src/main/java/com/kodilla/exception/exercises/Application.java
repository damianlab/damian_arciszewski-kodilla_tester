package com.kodilla.exception.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Dariusz Mac", new Teacher("Kowalski")),
                new Student("Maria Gec", new Teacher("Kowalski2")),
                new Student("Patryk Mac", null),
                new Student("Zenon Mac", null)
        );

        for (Student s : students) {
            System.out.print("uczeń: " + s.getName() + ", ");
            if (Optional.ofNullable(s.getTeacher()).isEmpty()) {
                System.out.println("nauczyciel: " + "<undefined>" + ", ");
            } else {
                System.out.println("nauczyciel: " + s.getTeacher().getName() + ", ");
            }
        }
    }
}
