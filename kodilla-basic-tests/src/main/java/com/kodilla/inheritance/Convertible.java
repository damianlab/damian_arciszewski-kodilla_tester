package com.kodilla.inheritance;

public class Convertible extends Car {  // dodatkowa klasa kabriolet jako rozszezenie do klasy Car

    public void openRoof() { // metoda otwierajaca dach
        System.out.println("Opening roof...");
    }

    public void closeRoof() { // metoda zamykajaca dach
        System.out.println("Closing roof...");
    }

    @Override // Adnotacja- kompilator sprawdzi, czy prawidlowo nadpisalismy metode
    public void openDoors() { // zmodyfikowana metoda z klasy Car
        System.out.println("Opening 2 doors");
    }
}