package com.kodilla.inheritance;

public class Car {
    private int wheels; // deklaracja zmiennej KOLA, private. Oznacza że zmienne nie będą bezpośrednio widoczne, a my nie będziemy mogli pobrać ich wartości za pomocą znanej nam już struktury nazwaObiektu.nazwaZmiennej
    private int seats; // deklaracja zmiennej SIEDZENIA

    public Car(int wheels, int seats) { // dodany konstruktor,+ dodajemy wartosci do zmiennych
        this.wheels = wheels;
        this.seats = seats; // wartosci do zmiennych
        // System.out.println("Car constructor");
    }

    public void turnOnLights() {    // metoda wlaczajaca swiatla nie zwraca wartosc void
        System.out.println("Lights were turned on");
    }
    public void openDoors() {
        System.out.println("Opening 4 doors");
    }

    public int getWheels() { // Gatter dla metody getWheels
        return wheels;
    }

    public int getSeats() { // Gatter dla metody getSeats
        return seats;
    }

    public void displayNumberOfSeats() {
        System.out.println("Number of seats: " + seats);
    }

}