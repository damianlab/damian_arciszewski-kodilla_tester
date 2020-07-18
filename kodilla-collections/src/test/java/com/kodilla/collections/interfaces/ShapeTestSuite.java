package com.kodilla.collections.interfaces;

import org.graalvm.compiler.debug.Assertions;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShapeTestSuite {

    @Test
    public void checkingAreaOfShapes() {
        // given
        Shape shape = new Circle(5);
        Shape shape1 = new Square(3);
        Shape shape2 = new Triangle(4, 6, 4);

        // then
        assertEquals(79.0, Math.round(shape.getArea()), 0.01);
        assertEquals(9, shape1.getArea(), 0.01);
        assertEquals(12, shape2.getArea(), 0.01);
    }

    @Test
    public void checkingPerimeterOfShapes() {
        // given
        Shape shape = new Circle(5);
        Shape shape1 = new Square(3);
        Shape shape2 = new Triangle(4, 6, 4);

        // then
        assertEquals(31.0, Math.round(shape.getPerimeter()), 0.01);
        assertEquals(12, shape1.getPerimeter(), 0.01);
        assertEquals(14, shape2.getPerimeter(), 0.01);
    }
}