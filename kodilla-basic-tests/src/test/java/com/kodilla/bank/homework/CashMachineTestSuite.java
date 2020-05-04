package com.kodilla.bank.homework;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() { // Test dla sprawdzenia zerowej dlugosci tabeli
        CashMachine cashmachine = new CashMachine();
        int[] values = cashmachine.getValues();
        assertEquals(0, values.length);
    }
    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashmachine = new CashMachine();
        cashmachine.add(500);
        cashmachine.add(-200);

        int[] values = cashmachine.getValues();
        assertEquals(2, values.length);
        assertEquals(500, values[0]);
        assertEquals(-200, values[1]);
    }
    @Test
    public void shouldCalculateCashAmount() {
        CashMachine cashmachine = new CashMachine();
        cashmachine.add(500);
        cashmachine.add(200);
        cashmachine.add(100);
        cashmachine.add(100);
        cashmachine.add(-100);

        assertEquals(800, cashmachine.getCashAmount(), 0.01); // dodatkowa wartosc delta to dopuszczalna roznica pomiedzy wynikami

    }
    @Test
    public void shouldCalculateAverage() {
        CashMachine cashmachine = new CashMachine();
        cashmachine.add(200);
        cashmachine.add(200);
        cashmachine.add(200);

        assertEquals(200, cashmachine.getAvarage(), 0.01); // dodatkowa wartosc delta to dopuszczalna roznica pomiedzy wynikami

    }
    @Test
    public void shouldAddTwoBanksToArray() {
        CashMachine cashmachine = new CashMachine();
        cashmachine.addBank("MRT");
        cashmachine.addBank("PKO");

        String[] banks = cashmachine.getNumberOfBanks();
        assertEquals(2, banks.length);
        assertEquals("MRT", banks[0]);
        assertEquals("PKO", banks[1]);
    }
}