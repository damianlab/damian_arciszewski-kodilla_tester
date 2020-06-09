package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
       LocalDate currentDate = LocalDate.now();
       List<Task> deadlineTask = TaskRepository.getTask()
            .stream()
            .filter(u -> u.getDeadline().isAfter(currentDate))
            //.map(Task::getDeadline)
            .collect(Collectors.toList());
        System.out.println("Dates not expired: ");
for(Task taskValid : deadlineTask)
    System.out.println(taskValid.getName() + " - " + taskValid.getDeadline());
      //  System.out.println("Dates not expired: \n" + deadlineTask);

       /* List<String> taskname = TaskRepository.getTask()
        .stream()
        .filter(u -> u.getDeadline().isAfter(currentDate))
        .map(TaskManager::getTaskName)
        .collect(Collectors.toList());
        System.out.println(taskname); */

    }

    public static String getTaskName(Task task) {
        return task.getName();
    }

}
