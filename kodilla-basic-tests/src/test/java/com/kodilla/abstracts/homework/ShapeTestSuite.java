package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTestSuite {

    @Test
    public void RectangleTest () {
        Rectangle rectangle = new Rectangle();
        assertEquals("Rectangle", rectangle.getName());
        assertEquals(5, rectangle.getSideA());
        assertEquals(10, rectangle.getSideB());
        assertEquals(0, rectangle.getSideC());
        assertEquals(0, rectangle.getHeigh());
        assertEquals(50, rectangle.getArea());
        assertEquals(30, rectangle.getPerimeter());
    }

    @Test
    public void SquareTest () {
        Square square = new Square();
        assertEquals("Square", square.getName());
        assertEquals(5, square.getSideA());
        assertEquals(5, square.getSideB());
        assertEquals(0, square.getSideC());
        assertEquals(0, square.getHeigh());
        assertEquals(25, square.getArea());
        assertEquals(20, square.getPerimeter());
    }

    @Test
    public void TriangleTest () {
        Triangle triangle = new Triangle();
        assertEquals("Triangle", triangle.getName());
        assertEquals(6, triangle.getSideA());
        assertEquals(6, triangle.getSideB());
        assertEquals(6, triangle.getSideC());
        assertEquals(5.2, triangle.getHeigh());
        assertEquals(15.6, triangle.getArea(), 0.01);
        assertEquals(18, triangle.getPerimeter());
    }


}