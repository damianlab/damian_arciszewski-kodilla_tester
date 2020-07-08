package com.kodilla.spring.basic.exercises.car;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarTestSuite {

    @Test
    public void returnCabrioAndLightsOnIfSummerDuringNight () {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.exercises");
        Car car = (Car) context.getBean("returnCarDependingOnTheSeason", Season.SUMMER, LocalTime.of(23, 0));

        assertTrue(car instanceof Cabrio);
        assertEquals("Cabrio", car.getCarType());
        assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void returnSUVAndLightsOffIfWinterDuringDay () {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.exercises");
        Car car = (Car) context.getBean("returnCarDependingOnTheSeason", Season.WINTER, LocalTime.of(6, 1));

        assertTrue(car instanceof SUV);
        assertEquals("SUV", car.getCarType());
        assertFalse(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void returnSedanAndLightsOnIfSpringDuringNight () {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.exercises");
        Car car = (Car) context.getBean("returnCarDependingOnTheSeason", Season.SPRING, LocalTime.of(5, 59));

        assertTrue(car instanceof Sedan);
        assertEquals("Sedan", car.getCarType());
        assertTrue(car.hasHeadlightsTurnedOn());
    }
}