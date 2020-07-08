package com.kodilla.spring.basic.exercises.car;

import java.time.LocalTime;

public class Sedan extends AbstractCar{

    public Sedan(LocalTime time) {
        super(time);
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }

}
