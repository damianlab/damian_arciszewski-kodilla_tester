package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.Random;
public class ShapeApplication {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[5]; // tworzymy pustą tablicę przechowujaca 5 elementow
        for (int n = 0; n < shapes.length; n++) // petla wywolujaca metode drawShape
            shapes[n] = drawShape();
        for ( Shape shape : shapes) // konstrukcja, wykonaj pewną operację dla każdego elementu tablicy shapes
            ShapeUtils.displayShapeInfo(shape); // kolejna petla ma wyswietlic wymiary figur znajdujacych sie w tabeli

    }


    private static Shape drawShape() {
        Random random = new Random(); // draw a kind of shape
        int drawnShapeKind = random.nextInt(3); // possible values 0, 1, 2
        double a = random.nextDouble() * 100 + 1; // possible values 1 do 100.999... losowanie wymiaru a
        double b = random.nextDouble() * 100 + 1;
        double c = random.nextDouble() * 100 + 1;
        if (drawnShapeKind == 0)
            return new Circle(a);
        else if (drawnShapeKind == 1)
            return new Square(a);
        else
            return new Triangle(a, b, c);
    }
}
