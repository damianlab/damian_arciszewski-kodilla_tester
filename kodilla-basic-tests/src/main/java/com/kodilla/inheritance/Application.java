package com.kodilla.inheritance;

public class Application {
    public static void main(String[] args) {

        Car car = new Car(4,5); // wywoluje metode turnOnLights z klasy Car. Dzieki Garrerom mozemy modyfikowac ilosc kol i siedzen
        car.turnOnLights(); // metoda wyswietla tekst zadeklarowany w klasie Car i metodzie turnOnLights
        car.displayNumberOfSeats();
        Convertible convertible = new Convertible(4,2); // wywoluje metode openDoors z klasy CarConvertible
        convertible.turnOnLights(); // obiekt wyswietl tekst z metody openDoors z klasy Convertible
        convertible.displayNumberOfSeats();


    }
}
