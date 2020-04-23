package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    public Triangle() {
        super("Triangle", 6,6, 6, 5.2 );

    }

    @Override
    public double getArea() {
        double i = 0.5 * getSideA() + getHeigh();
        System.out.println("Area of" + " " + getName() + " " + "is" + " " + i);
        return i;
    }

    @Override
    public double getPerimeter() {
        double b;
        b = getSideA() + getSideB() + getSideC();
        System.out.println("Perimeter of" + " " + getName() + " " + "is" + " " + b);
        return b;
    }
}
