package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public class Opel implements Car{
    int speed;

    @Override
    public void increaseSpeed() {
        Random random = new Random();
        int step = random.nextInt(50);
        speed = speed + step;
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
