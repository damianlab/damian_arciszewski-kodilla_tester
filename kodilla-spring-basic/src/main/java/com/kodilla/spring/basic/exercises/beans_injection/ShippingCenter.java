package com.kodilla.spring.basic.exercises.beans_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShippingCenter {

    private DeliveryService deliveryService;
    private NotificationService notificationService;

    @Autowired
    public ShippingCenter(InPostDeliveryService deliveryService, SmsNotificationService notificationService) {
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }

    public String sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            notificationService.success(address);
            return "Package delivered to " + address;
        } else {
            notificationService.fail(address);
            return "Package not delivered to " + address;
        }
    }
}
