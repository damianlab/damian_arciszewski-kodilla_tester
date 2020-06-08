package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTask() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Laundry", LocalDate.of(2020, 06,23), LocalDate.of(2020,6,25) ));
        tasks.add(new Task("Doctor visit", LocalDate.of(2020,06,24), LocalDate.of(2020, 6,28)));
        tasks.add(new Task("Shopping", LocalDate.of(2020,05,03), LocalDate.of(2020, 5, 8)));
        tasks.add(new Task("Trip to Szczecin", LocalDate.of(2020, 05, 23), LocalDate.of(2020, 06,26)));
        return tasks;

    }
}
