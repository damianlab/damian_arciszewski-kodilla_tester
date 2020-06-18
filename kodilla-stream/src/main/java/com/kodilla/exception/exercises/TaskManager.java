package com.kodilla.exception.exercises;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> deadlinesBeforeNow = TaskRepository.getTasks()
                .stream()
                .map(task -> task.getDeadline())
                .filter(localDate -> localDate.isBefore(LocalDate.now()))
                .collect(Collectors.toList());

        System.out.println(deadlinesBeforeNow);

        List<Task> tasksWithDeadlineBeforeNow = TaskRepository.getTasks()
                .stream()
                .filter(task -> task.getDeadline().isBefore(LocalDate.now()))
                .collect(Collectors.toList());

        System.out.println(tasksWithDeadlineBeforeNow);
    }
}
