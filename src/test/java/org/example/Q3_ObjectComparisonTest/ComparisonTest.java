package org.example.Q3_ObjectComparisonTest;

import org.example.Q3_ObjectComparison.Shape;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComparisonTest {
    private static Shape triangle;
    private static Shape triangle2;
    private static Shape triangle3;
    private static Shape trapezoid;

    @BeforeAll
    public static void setup() {
        triangle = new Shape("Triangle", "Orange", 3);
        triangle2 = new Shape("Triangle", "Orange", 3);
        triangle3 = triangle;
        trapezoid = new Shape("Trapezoid", "Purple", 4);
    }

    @Test
    public void testEqualsByRef_DiffRef_DiffVal() {
        assertFalse(triangle == trapezoid);
    }

    @Test
    public void testEqualsByRef_DiffRef_SameVal() {
        assertFalse(triangle == triangle2);
    }

    @Test
    public void testEqualsByRef_SameRef_SameVal() {
        assertTrue(triangle == triangle3);
    }

    @Test
    public void testEqualsByVal_DiffRef_DiffVal() {
        assertFalse(triangle.equals(trapezoid));
    }

    @Test
    public void testEqualsByVal_DiffRef_SameVal() {
        assertTrue(triangle.equals(triangle2));
    }

    @Test
    public void testEqualsByVal_SameRef_SameVal() {
        assertTrue(triangle.equals(triangle3));
    }
}