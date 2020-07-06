package com.kodilla.spring.basic.exercises.exercises_dependency_injection;

public class ApplicationRunner {
    public static void main(String[] args) {
        Application application = new Application();
        application.processNotification("Test notification", "receiver@mail.com");
    }
}
