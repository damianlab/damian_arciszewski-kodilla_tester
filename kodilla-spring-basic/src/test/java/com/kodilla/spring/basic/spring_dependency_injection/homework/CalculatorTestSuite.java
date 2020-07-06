package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class CalculatorTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    Calculator calculator = context.getBean(Calculator.class);

    @Test
    public void shouldAddTwoNumbers() {
        // when
        double sum = calculator.add(3.5, 2.5);

        // then
        assertEquals(6, sum, 0.001);
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        // when
        double diff = calculator.subtract(4.5, 1.5);

        // then
        assertEquals(3, diff, 0.001);
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        // when
        double product = calculator.multiply(2.4, 1.4);

        // then
        assertEquals(3.36, product, 0.001);
    }

    @Test
    public void shouldDivideTwoNumbers() {
        // when
        double quotient = calculator.divide(6.4, 2);

        // then
        assertEquals(3.2, quotient, 0.001);
    }

    @Test
    public void shouldThrowExceptionWhenDividingByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(456, 0);
        });
    }
}