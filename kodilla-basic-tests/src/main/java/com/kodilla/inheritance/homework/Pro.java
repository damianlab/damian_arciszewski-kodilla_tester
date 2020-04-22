package com.kodilla.inheritance.homework;

public class Pro extends OperatingSystem {  // Dodatkowa klasa rozszerzajaca klasa OperatingSystem

    public void turnOnWiFI() { // metoda wlaczajaca WiFi
        System.out.println("WiFi on");
    }

    public void turnOffWiFI() { // metoda wylaczajaca WiFi
        System.out.println("WiFi off");
    }

    @Override // Metoda nadpisana
    public void users() {
        System.out.println("Access for 6 users");
    }
    @Override // Metoda nadpisana
    public void utilities() {
        System.out.println("System utilities available: 12 ");
    }

    public Pro(int type, int year) {
        super( type, year);
        //System.out.println("Pro constructor");
    }
}