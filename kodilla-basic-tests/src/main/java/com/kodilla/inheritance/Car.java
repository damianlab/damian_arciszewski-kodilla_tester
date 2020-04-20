package com.kodilla.inheritance;

public class Car {
    private int wheels; // deklaracja zmiennej KOLA, private. Oznacza że zmienne nie będą bezpośrednio widoczne, a my nie będziemy mogli pobrać ich wartości za pomocą znanej nam już struktury nazwaObiektu.nazwaZmiennej
    private int seats; // deklaracja zmiennej SIEDZENIA

    public void turnOnLights() {    // metoda wlaczajaca swiatla nie zwraca wartosc void
        System.out.println("Lights were turned on");
    }
    public void openDoors() {
        System.out.println("Opening 4 doors");

    }
}