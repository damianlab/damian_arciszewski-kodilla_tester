package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "providePeopleDataForTestingBMI")
    public void shouldReturnProperMessageAccordingToBMI(double heightInMeters, double weightInKilograms, String expectedMessage) {
        Person person = new Person(heightInMeters, weightInKilograms);
        assertEquals(expectedMessage, person.getBMI());
    }

    private static Stream<Arguments> providePeopleDataForTestingBMI() {
        return Stream.of(
                Arguments.of(1.80d, 40d, "Very severely underweight"),
                Arguments.of(1.70d, 45d, "Severely underweight"),
                Arguments.of(1.75d, 52d, "Underweight"),
                Arguments.of(1.76d, 60d, "Normal (healthy weight)"),
                Arguments.of(1.79d, 83d, "Overweight"),
                Arguments.of(1.77d, 95d, "Obese Class I (Moderately obese)"),
                Arguments.of(1.81d, 118d, "Obese Class II (Severely obese)"),
                Arguments.of(1.82d, 134d, "Obese Class III (Very severely obese)"),
                Arguments.of(1.68d, 130d, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.69d, 148d, "Obese Class V (Super Obese)"),
                Arguments.of(1.70d, 180d, "Obese Class VI (Hyper Obese)")
        );
    }

}