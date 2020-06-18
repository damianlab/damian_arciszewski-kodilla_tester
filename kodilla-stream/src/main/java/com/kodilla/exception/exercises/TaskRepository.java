package com.kodilla.exception.exercises;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        return Arrays.asList(
                new Task("Pranie", LocalDate.of(2020,2,3), LocalDate.of(2022,5,12)),
                new Task("Pranie", LocalDate.of(2019,1,3), LocalDate.of(2018,5,10)),
                new Task("Pranie", LocalDate.of(2018,2,3), LocalDate.of(2022,5,10))
        );

    }

}
