package com.kodilla.spring.basic.exercises.beans_injection;

import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements NotificationService {


    @Override
    public void success(String address) {
        System.out.println("Email: Package delivered to: " + address);
    }

    @Override
    public void fail(String address) {
        System.out.println("Email: Package not delivered to: " + address);
    }
}
