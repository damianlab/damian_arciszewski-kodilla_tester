package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.displayName();
        rectangle.getArea();
        rectangle.getPerimeter();

        Square square = new Square();
        square.displayName();
        square.getArea();
        square.getPerimeter();

        Triangle triangle = new Triangle();
        triangle.displayName();
        triangle.getArea();
        triangle.getPerimeter();
    }

}
