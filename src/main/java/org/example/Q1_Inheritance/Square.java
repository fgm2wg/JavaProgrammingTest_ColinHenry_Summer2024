package org.example.Q1_Inheritance;

/**
 * Represents a 2D square shape
 */
public class Square implements Shape {
    /**
     * Represents the length of any side (all the same for a square)
     */
    private double length;

    /**
     * Constructor to initialize the square with a specified side length
     * @param length - length of any side of the square
     */
    public Square(double length) {
        setLength(length);
    }

    /**
     * Gets the length of the square's sides
     * @return length of the square's sides
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the length of the square's sides
     * @param length - length of any side of the square
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Calculates the perimeter of the square
     * @return square perimeter (4a)
     */
    @Override
    public double perimeter() {
        return 4 * length;
    }

    /**
     * Calculates the area of the square
     * @return square area (a^2)
     */
    @Override
    public double area() {
        return length * length;
    }

    /**
     * Gets the number of sides of the square (4)
     * @return 4 sides
     */
    @Override
    public int getSides() {
        return 4;
    }

    @Override
    public String toString() {
        return "Square (side length " + length + ")";
    }
}
