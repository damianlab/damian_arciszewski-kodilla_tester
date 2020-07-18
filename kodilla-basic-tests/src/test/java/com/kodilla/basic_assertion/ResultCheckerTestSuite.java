package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultCheckerTestSuite {

    @Test
    public void assertEqualsFirstTest () {
        assertTrue(ResultChecker.assertEquals(1, 1));
    }

    @Test
    public void assertEqualsSecondTest () {
        assertTrue(ResultChecker.assertEqualsSecond(2, 2));
    }
    @Test
    public void assertEqualsSquareTest () {
        assertTrue(ResultChecker.assertEqualsSquare(2.3, 2.3));
    }

}