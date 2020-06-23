package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidUserNumbers.csv", numLinesToSkip = 1, delimiter = ';')
    public void shouldThrowInvalidNumbersExceptionWhenUserNumbersSizeNotSix(String userNumbers) throws InvalidNumbersException {
        Set<Integer> userNumbersSet
                = Arrays.stream(userNumbers.split(",")).map(Integer::parseInt).collect(Collectors.toSet());

        assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(userNumbersSet);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/validUserNumbers.csv", numLinesToSkip = 1, delimiter = ';')
    public void shouldNotThrowInvalidNumbersExceptionWhenUserNumbersSizeNotSix(String userNumbers) throws InvalidNumbersException {
        Set<Integer> userNumbersSet
                = Arrays.stream(userNumbers.split(",")).map(Integer::parseInt).collect(Collectors.toSet());

        gamblingMachine.howManyWins(userNumbersSet);
    }


}