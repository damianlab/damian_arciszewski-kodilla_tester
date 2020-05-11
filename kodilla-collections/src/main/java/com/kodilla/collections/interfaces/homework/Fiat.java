package com.kodilla.collections.interfaces.homework;

public class Fiat implements Car{
    int speed;

    @Override
    public void increaseSpeed() {
        speed = speed + 8;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 5;

    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
