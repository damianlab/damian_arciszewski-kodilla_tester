package com.kodilla.spring.basic.exercises.beans_injection;

import org.springframework.stereotype.Service;

@Service
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
