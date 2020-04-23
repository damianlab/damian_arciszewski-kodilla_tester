package com.kodilla.abstracts.homework;

public abstract class Shape {
    private String name;
    private double sideA; // deklaracja zmiennej ilosc bokow
    private double sideB;
    private double sideC;
    private double height;



    public Shape (String name, double sideA, double sideB, double sideC, double height ) { // tworzymy konstruktor
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;


    }
    public String getName() {
        return name;
    }

    public double getSideA() {
        return sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public double getSideC() {
        return sideC;
    }

    public double getHeigh() {
        return height;
    }
// z dwiema abstrakcyjnymi metodami obliczającym pole powierzchni i obwód.
// Utwórz trzy klasy dziedziczące po klasie Shape wraz

    public void displayName() { System.out.println("Shape: " + " " + getName()); }
    public abstract double getArea(); // 1 metoda abstrakcyjna na pole powierzchni
    public abstract double getPerimeter(); // 2 metoda na obwod - kazda figura ma specyficzny wzor

}
