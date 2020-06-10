package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Karol Mark", new Teacher("Marek Wark")));
        students.add(new Student("Monika Cyc", new Teacher("Mira Dir")));
        students.add(new Student("Piotr Maj", null));
        students.add(new Student("Wiktor Bak", null));

        // for(Student stu : students) System.out.println("Student name: " + stu.getName() + " - " + "Teacher name: " + stu.getTeacher());
        for(Student stu : students) {
            System.out.println("Student name: " + stu.getName() + " - " + "Teacher name: " + Optional.ofNullable(stu.getTeacher()).map(u -> u.getName()).orElse("<undefined>"));
        }
    }
}
