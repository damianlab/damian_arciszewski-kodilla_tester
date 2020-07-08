package com.kodilla.spring.basic.exercises.car;

import java.time.LocalTime;

public abstract class AbstractCar implements Car{

    private LocalTime time;

    public AbstractCar(LocalTime time) {
        this.time = time;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return time.isAfter(LocalTime.of(20, 0)) || time.isBefore(LocalTime.of(6, 0));
    }
}
