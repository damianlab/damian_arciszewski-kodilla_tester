package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ShippingCenterTestSuit {

    @Test
    public void shouldReturnMessageSuccessWhenWeightIsCorrect() {
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String expectedResult = "Package delivered to: Szczecin";

        // when
        String actualResult = bean.sendPackage("Szczecin", 16);

        // then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldReturnMessageFailWhenWeightIsNotCorrect() {
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String expectedResult = "Package not delivered to: Szczecin";

        // when
        String actualResult = bean.sendPackage("Szczecin", 42);

        // then
        Assertions.assertEquals(expectedResult, actualResult);
    }
}