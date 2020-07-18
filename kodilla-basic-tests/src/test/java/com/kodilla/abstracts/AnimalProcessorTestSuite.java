package com.kodilla.abstracts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalProcessorTestSuite {

    AnimalProcessor animalProcessor = new AnimalProcessor();

    @Test
    public void shouldReturnFourLegsForDog () {
        // Given
        Dog dog = new Dog();

        animalProcessor.process(dog);

    }

    @Test
    public void shouldReturnTwoLegsForDuck () {
       Duck duck = new Duck();

       animalProcessor.process(duck);
    }


}