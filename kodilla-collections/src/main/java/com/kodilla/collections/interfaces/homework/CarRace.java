package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford();
        ford.increaseSpeed(5);
        ford.increaseSpeed(20);
        ford.increaseSpeed(10);
        ford.decreaseSpeed(-20);
        ford.decreaseSpeed(-5);
        ford.increaseSpeed(10);

        showCarParameters(ford);
        // System.out.println(ford.getSpeed());
        // System.out.println(ford.getValues().length);

        Fiat fiat = new Fiat();
        fiat.increaseSpeed(10);
        fiat.increaseSpeed(10);
        fiat.increaseSpeed(10);
        fiat.decreaseSpeed(-5);
        fiat.decreaseSpeed(-5);

        showCarParameters(fiat);

        // System.out.println(fiat.getSpeed());
        // System.out.println(fiat.getValues().length);

        Opel opel = new Opel();
        opel.increaseSpeed(20);
        opel.increaseSpeed(20);
        opel.increaseSpeed(20);
        opel.decreaseSpeed(-5);
        opel.decreaseSpeed(-5);

        showCarParameters(opel);
    }

    private static void showCarParameters(Car car) {
        System.out.println(car.getSpeed());
        System.out.println(car.getValues().length);

    }
}
