package com.kodilla.spring.basic.exercises.exercises_dependency_injection;

public class Application {
    private NotificationService notificationService = new NotificationService();

    public void processNotification(String notification, String receiver) {
        if (checkReceiver(receiver)) {
            this.notificationService.send(notification, receiver);
        }
    }

    private boolean checkReceiver(String receiver) {
        return receiver != null && !receiver.isEmpty();
    }
}
