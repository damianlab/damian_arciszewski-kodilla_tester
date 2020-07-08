package com.kodilla.spring.basic.exercises.beans_injection;

import org.springframework.stereotype.Service;

@Service
public class InPostDeliveryService implements DeliveryService {
    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 25) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Delivering in progress...");
        return true;
    }
}
