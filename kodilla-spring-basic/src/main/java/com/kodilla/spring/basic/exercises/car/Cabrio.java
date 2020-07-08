package com.kodilla.spring.basic.exercises.car;

import java.time.LocalTime;

public class Cabrio extends AbstractCar{

    public Cabrio(LocalTime time) {
        super(time);
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
