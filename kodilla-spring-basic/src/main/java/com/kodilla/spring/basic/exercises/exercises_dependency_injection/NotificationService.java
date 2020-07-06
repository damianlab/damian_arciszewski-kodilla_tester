package com.kodilla.spring.basic.exercises.exercises_dependency_injection;

public class NotificationService {
    public void send(String notification, String receiver) {
        System.out.println("Sending notification [" + notification + "] to: " + receiver);
    }
}
