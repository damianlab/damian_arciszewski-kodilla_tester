package com.kodilla.spring.basic.dependency_injection.homework;

public class SmsNotificationService implements NotificationService {
    @Override
    public void success(String address) {
        System.out.println("Sms: Package delivered to: " + address);
    }

    @Override
    public void fail(String address) {
        System.out.println("Sms: Package not delivered to: " + address);
    }
}
