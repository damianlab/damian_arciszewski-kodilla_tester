package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford();
        ford.increaseSpeed(10);
        ford.increaseSpeed(20);
        ford.increaseSpeed(10);
        ford.decreaseSpeed(-20);
        ford.decreaseSpeed(-5);

        System.out.println(ford.getSpeed());
        System.out.println(ford.getValues().length);

        Fiat fiat = new Fiat();
        fiat.increaseSpeed(10);
        fiat.increaseSpeed(10);
        fiat.increaseSpeed(10);
        fiat.decreaseSpeed(-5);
        fiat.decreaseSpeed(-5);

        System.out.println(fiat.getSpeed());
        System.out.println(fiat.getValues().length);
    }
}
