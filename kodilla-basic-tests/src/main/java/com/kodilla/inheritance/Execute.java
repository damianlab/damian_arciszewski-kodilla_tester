package com.kodilla.inheritance;

public class Execute {
    public static void main(String[] args) {

        OperatingSystem operatingsystem = new OperatingSystem(32,2017);
        operatingsystem.turnOn();
        operatingsystem.displayYearOfPublication();
        operatingsystem.users();
        operatingsystem.utilities();
        Pro pro = new Pro(64,2018); // deklaracja zmiennych dla systemu Pro
        pro.turnOff(); // Obiekt wyswietl tekst z metody turnOff z klasy OperatingSystem
        pro.displayYearOfPublication();
        pro.users();
        pro.utilities();


    }
}

