package com.kodilla.spring.basic.exercises.beans_injection;

import com.kodilla.spring.basic.spring_dependency_injection.SimpleApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTestSuite {

    @Test
    public void shouldSendPackageIfWeightCorrect() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.exercises");
        ShippingCenter sc = context.getBean(ShippingCenter.class);

        String message = sc.sendPackage("Szczecin, Jagielonska 20", 20);
        assertEquals("Package delivered to Szczecin, Jagielonska 20", message);
    }

    @Test
    public void shouldReturnFailIfWeightNotCorrect() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.exercises");
        ShippingCenter sc = context.getBean(ShippingCenter.class);

        String message = sc.sendPackage("Szczecin, Jagielonska 20", 30);
        assertEquals("Package not delivered to Szczecin, Jagielonska 20", message);
    }

}