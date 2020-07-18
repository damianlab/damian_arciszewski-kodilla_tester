package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JobTestSuite {

    @Test
    public void DoctorTest () {
        Doctor doctor = new Doctor();
        assertEquals(3456, doctor.getSalary());
        assertEquals("-undertaking patient consultations and physical examinations" + "\n-organising workloads" + "\n -performing surgical procedures", doctor.getResponsibilities());
        }

}