package com.kodilla.bank.homework;

import com.kodilla.school.Grades;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    @Test
    public void shouldCalculateCorrectCashAmountIfValuesAreInRange() { // Testujemy bankomat
        Bank bank = new Bank ("MRT"); // test polega na dodaniu bankomatu wraz z transakcjami
        bank.addDepositCashMachine(250);
        bank.addDepositCashMachine(150);
        bank.addDepositCashMachine(50);

        bank.addWithdrawCashMachine(-150);
        bank.addWithdrawCashMachine(-150);

        double depositCashAmount = bank.getDepositAmount();
        double withdrawCashAmount = bank.getWithdrawAmount();

        assertEquals(200, depositCashAmount, 0.01);
        assertEquals(-300, withdrawCashAmount, 0.01);

    }

    @Test
    public void shouldCalculateAllCashMachinesInRange() {
        Bank bank = new Bank ("MRT");
        bank.addDepositCashMachine(250);
        bank.addDepositCashMachine(150);
        bank.addDepositCashMachine(50);

        bank.addWithdrawCashMachine(-150);
        bank.addWithdrawCashMachine(-150);

        Bank bank1 = new Bank ("PKO");
        bank1.addDepositCashMachine(250);
        bank1.addDepositCashMachine(150);
        bank1.addDepositCashMachine(150);

        bank1.addWithdrawCashMachine(-50);
        bank1.addWithdrawCashMachine(-50);

        double depositCashAmount = bank.getDepositAmount()+bank1.getDepositAmount();
        double withdrawCashAmount = bank.getWithdrawAmount()+bank1.getWithdrawAmount();

        assertEquals(500, depositCashAmount, 0.01);
        assertEquals(-400, withdrawCashAmount, 0.01);

    }

    @Test
    public void shouldAddTwoElementsToDepositArray() { // Test dla ilosci przeprowadzonych transakcji typu Deposit
        Bank bank = new Bank("MRT");
        bank.addDepositCashMachine(100);
        bank.addDepositCashMachine(150);
        bank.addDepositCashMachine(-150);


        int[] values = bank.getDepositNumberOfOperations();
        assertEquals(2, values.length);
        assertEquals(100, values[0]);
        assertEquals(150, values[1]);
    }

    @Test
    public void shouldAddTwoElementsToWithdrawArray() {
        Bank bank = new Bank("MRT");
        bank.addWithdrawCashMachine(150);
        bank.addWithdrawCashMachine(-150);
        bank.addWithdrawCashMachine(-150);


        int[] values = bank.getWithdrawNumberOfOperations();
        assertEquals(2, values.length);
        assertEquals(-150, values[0]);
        assertEquals(-150, values[1]);
    }


    @Test
    public void shouldCalculateDepositAndWithdrawAvarage() {
        Bank bank = new Bank ("MRT");
        bank.addDepositCashMachine(100);
        bank.addDepositCashMachine(50);
        bank.addDepositCashMachine(150);
        bank.addDepositCashMachine(250);
        bank.addDepositCashMachine(100);


        bank.addWithdrawCashMachine(-50);
        bank.addWithdrawCashMachine(-50);

        assertEquals(100, bank.getDepositAvarage(), 0.001);
        assertEquals(-50, bank.getWithrawAvarage(), 0.001);
    }

}

