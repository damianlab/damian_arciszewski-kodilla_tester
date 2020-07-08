package com.kodilla.spring.basic.exercises.car;

import java.time.LocalTime;

public class SUV extends AbstractCar{

    public SUV(LocalTime time) {
        super(time);
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
