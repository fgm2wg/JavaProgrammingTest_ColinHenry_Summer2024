package org.example.Q1_InheritanceTest;

/**
 * Represents a 2D rectangle shape
 */
public class Rectangle implements Shape {
    /**
     * Represents the length of the rectangle (2 vertical sides)
     */
    private double length;

    /**
     * Represents the width of the rectangle (2 horizontal sides)
     */
    private double width;

    /**
     * Constructor to initialize the rectangle with a specified length & width
     * @param width - width of the rectangle
     * @param length - length of the rectangle
     */
    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    /**
     * Gets the width of the rectangle
     * @return width of the rectangle
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width of the rectangle
     * @param width - width of the rectangle
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Gets the length of the rectangle
     * @return length of the rectangle
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the length of the rectangle
     * @param length - length of the rectangle
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Calculates the perimeter of the rectangle
     * @return rectangle perimeter (2l + 2w)
     */
    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    /**
     * Calculates the area of the rectangle
     * @return rectangle area (lw)
     */
    @Override
    public double area() {
        return length * width;
    }

    /**
     * Gets the number of sides of the rectangle (4)
     * @return 4 sides
     */
    @Override
    public int getSides() {
        return 4;
    }

    @Override
    public String toString() {
        return "Rectangle (length " + length + " and width " + width + ")";
    }
}