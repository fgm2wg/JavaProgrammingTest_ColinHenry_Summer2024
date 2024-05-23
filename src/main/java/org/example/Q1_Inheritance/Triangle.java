package org.example.Q1_Inheritance;

/**
 * Represents a 2D triangle shape
 */
public class Triangle implements Shape {
    /**
     *
     */
    private double side1;

    /**
     *
     */
    private double side2;

    /**
     *
     */
    private double side3;

    /**
     *
     */
    public Triangle(double a, double b, double c) {
        setSide1(a);
        setSide2(b);
        setSide3(c);
    }

    /**
     *
     */
    public double getSide1() {
        return side1;
    }

    /**
     *
     */
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    /**
     *
     */
    public double getSide2() {
        return side2;
    }

    /**
     *
     */
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    /**
     *
     */
    public double getSide3() {
        return side3;
    }

    /**
     *
     */
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    /**
     *
     */
    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    /**
     *
     */
    @Override
    public double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /**
     *
     */
    @Override
    public int getSides() {
        return 3;
    }
}
