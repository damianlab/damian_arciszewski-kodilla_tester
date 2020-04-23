package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{

    public Rectangle() {
        super("Rectangle", 5, 10, 0, 0 );

    }

    @Override
    public double getArea() {
        double i;
        i = getSideA() * getSideB();
        System.out.println("Area of" + " " + getName() + " " + "is" + " " + i);
        return i;
    }

    @Override
    public double getPerimeter() {
        double b;
        b = 2 * ( getSideA() + getSideB());
        System.out.println("Perimeter of" + " " + getName() + " " + "is" + " " + b);
        return b;
    }



}
