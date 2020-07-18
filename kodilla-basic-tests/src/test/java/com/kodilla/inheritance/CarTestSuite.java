package com.kodilla.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTestSuite {

    @Test
    public void testConvertible() {
        Car convertible = new Convertible(4, 10);

        convertible.openDoors();
        convertible.turnOnLights();

        assertEquals(4, convertible.getWheels());
        assertEquals(10, convertible.getSeats());
    }

}