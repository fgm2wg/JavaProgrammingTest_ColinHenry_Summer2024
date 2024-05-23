package org.example.Q1_Inheritance;

/**
 * Represents a 2D triangle shape
 */
public class Triangle implements Shape {
    /**
     * Represents leftmost side of the triangle (side a)
     */
    private double side1;

    /**
     * Represents base/bottom side of the triangle (side b)
     */
    private double side2;

    /**
     * Represents rightmost side of the triangle (side c)
     */
    private double side3;

    /**
     * Constructor to initialize the triangle with specified side lengths
     * @param a - leftmost side of the triangle (side1)
     * @param b - base of the triangle (side2)
     * @param c - rightmost side of the triangle (side3)
     */
    public Triangle(double a, double b, double c) {
        setSide1(a);
        setSide2(b);
        setSide3(c);
    }

    /**
     * Gets the length of side1 of the triangle
     */
    public double getSide1() {
        return side1;
    }

    /**
     * Sets the length of side1 of the triangle
     * @param side1 - length of the leftmost side of the triangle
     */
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    /**
     * Gets the length of side2 of the triangle
     */
    public double getSide2() {
        return side2;
    }

    /**
     * Sets the length of side2 of the triangle
     * @param side2 - length of the base of the triangle
     */
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    /**
     * Gets the length of side3 of the triangle
     */
    public double getSide3() {
        return side3;
    }

    /**
     * Sets the length of side3 of the triangle
     * @param side3 - length of the rightmost side of the triangle
     */
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    /**
     * Calculates the perimeter of the triangle
     * @return triangle perimeter (a+b+c)
     */
    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    /**
     * Calculates the area of the triangle (using Heron's Formula given three side lengths)
     * The semi perimeter, s, follows the formula (a+b+c)/2
     * @return triangle area ( sqrt(s(s-a)(s-b)(s-c)) )
     */
    @Override
    public double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /**
     * Gets the number of sides of the triangle (3)
     * @return 3 sides
     */
    @Override
    public int getSides() {
        return 3;
    }

    @Override
    public String toString() {
        return "Triangle (sides length " + side1 + ", " + side2 + ", and " + side3 + ")";
    }
}