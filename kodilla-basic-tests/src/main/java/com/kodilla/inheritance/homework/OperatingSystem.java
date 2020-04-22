package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int type;
    private int year;

    public OperatingSystem(int type, int year) {
        this.type = type;
        this.year = year;
    }

    public void turnOn() {
        System.out.println("System turned on");
    }

    public void turnOff() {
        System.out.println("System turned off");
    }

    public void users() {
        System.out.println("Access for 4 users");
    }

    public void utilities() {
        System.out.println("System utilities available: 8");
    }

    public void virtualMemory() {
        System.out.println("Available virtual memory 2 GB");
    }

    public int getType() {
        return type;
    }
    public int getYear() {
        return year;
    }
    public void displayYearOfPublication() {
        System.out.println("Year of Publication: " + year);
    }
}
