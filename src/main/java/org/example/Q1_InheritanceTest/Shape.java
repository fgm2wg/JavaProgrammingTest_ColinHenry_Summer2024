package org.example.Q1_InheritanceTest;

/**
 * Interface represents a 2D geometric shape (with sides)
 */
public interface Shape {
    /**
     * Calculates the perimeter of the shape
     * @return perimeter of the shape
     */
    double perimeter();

    /**
     * Calculates the area of the shape
     * @return area of the shape
     */
    double area();

    /**
     * Gets the number of sides of the shape
     * @return number of sides of the shape
     */
    int getSides();
}