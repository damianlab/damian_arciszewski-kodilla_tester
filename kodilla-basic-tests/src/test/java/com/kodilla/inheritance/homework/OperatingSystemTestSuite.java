package com.kodilla.inheritance.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatingSystemTestSuite {

    @Test
    public void TestPro () {
        Pro pro = new Pro(32,2017);

        pro.turnOnWiFI();
        pro.turnOffWiFI();

        assertEquals(32, pro.getType());
        assertEquals(2017, pro.getYear());
    }

}