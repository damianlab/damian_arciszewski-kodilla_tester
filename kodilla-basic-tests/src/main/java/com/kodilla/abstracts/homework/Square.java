package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square() {
        super("Square",5,5, 0, 0 );
    }

    @Override
    public double getArea() {
        double i;
        i = getSideA() * getSideB();
        System.out.println("Area of" + " " + getName() + " " + "is" + " " +i);
        return i;
    }

    @Override
    public double getPerimeter() {
        double b;
        b = 4 * getSideA();
        System.out.println("Perimeter of" + " " + getName() + " " + "is" + " " + b);
        return b;
    }

}
