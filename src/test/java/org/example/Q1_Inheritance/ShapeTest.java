package org.example.Q1_Inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {
    @Test
    public void testSquare_equivalence() {
        Square square = new Square(5);
        assertEquals(20, square.perimeter(), 0.01);
        assertEquals(25, square.area(), 0.01);
        assertEquals(4, square.getSides());
    }

    @Test
    public void testSquare_boundary() {
        Square square = new Square(0);
        assertEquals(0, square.perimeter(), 0.01);
        assertEquals(0, square.area(), 0.01);
        assertEquals(4, square.getSides());
    }

    @Test
    public void testRectangle_equivalence() {
        Rectangle rect = new Rectangle(4, 5);
        assertEquals(18, rect.perimeter(), 0.01);
        assertEquals(20, rect.area(), 0.01);
        assertEquals(4, rect.getSides());
    }

    @Test
    public void testRectangle_boundary() {
        Rectangle rect = new Rectangle(0, 0);
        assertEquals(0, rect.perimeter(), 0.01);
        assertEquals(0, rect.area(), 0.01);
        assertEquals(4, rect.getSides());
    }

    @Test
    public void testTriangle_equivalence() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(12, triangle.perimeter(), 0.01);
        assertEquals(6, triangle.area(), 0.01);
        assertEquals(3, triangle.getSides());
    }

    @Test
    public void testTriangle_boundary() {
        Triangle triangle = new Triangle(0, 0, 0);
        assertEquals(0, triangle.perimeter(), 0.01);
        assertEquals(0, triangle.area(), 0.01);
        assertEquals(3, triangle.getSides());
    }
}