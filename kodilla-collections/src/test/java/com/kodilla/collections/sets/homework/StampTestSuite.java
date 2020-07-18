package com.kodilla.collections.sets.homework;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StampTestSuite {

        private Stamp stamp = new Stamp("Stamp1", 22, 13, true);

        @Test
        public void checkingGetStampName() {
            assertEquals("Stamp1", stamp.getStampName());
        }

        @Test
        public void checkingGetStampHeight() {
            assertEquals(22, stamp.getStampHeight());
        }

        @Test
        public void checkingGetStampWidth() {
            assertEquals(13, stamp.getStampWidth());
        }

        @Test
        public void returnTrueIfStampStamped() {
            assertTrue(stamp.getStampStamped());
        }
    }