package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        CarRace carRace = new CarRace();

        Ford ford = new Ford(); // obiekty samochodow
        carRace.doRace(ford);

        Fiat fiat = new Fiat();
        carRace.doRace(fiat);

        Opel opel = new Opel();
        carRace.doRace(opel);
    }


    private static void doRace(Car car) {
        for(int i = 0; i < 5; i++) {
            car.increaseSpeed();
        }
        for (int i = 0; i < 3; i++){
            car.decreaseSpeed();
        }
        System.out.println(car.getClass().getSimpleName() +": " + car.getSpeed());
    }
}
