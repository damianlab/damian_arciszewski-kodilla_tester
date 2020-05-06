package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford();
        ford.increaseSpeed();
        ford.increaseSpeed();
        ford.increaseSpeed();
        ford.decreaseSpeed();
        ford.decreaseSpeed();
        ford.increaseSpeed();

        showCarParameters(ford);
        // System.out.println(ford.getSpeed());
        // System.out.println(ford.getValues().length);

        Fiat fiat = new Fiat();
        fiat.increaseSpeed();
        fiat.increaseSpeed();
        fiat.increaseSpeed();
        fiat.decreaseSpeed();
        fiat.decreaseSpeed();

        showCarParameters(fiat);

        // System.out.println(fiat.getSpeed());
        // System.out.println(fiat.getValues().length);

        Opel opel = new Opel();
        opel.increaseSpeed();
        opel.increaseSpeed();
        opel.increaseSpeed();
        opel.decreaseSpeed();
        opel.decreaseSpeed();

        showCarParameters(opel);
    }

    private static void showCarParameters(Car car) {
        System.out.println("Speed: "+ car.getSpeed());
        System.out.println("Number of operations: " + car.getValues().length);

    }
}
