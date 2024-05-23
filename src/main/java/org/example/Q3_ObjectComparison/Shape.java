package org.example.Q3_ObjectComparison;

import java.util.Objects;

/**
 * Represents a 2D Shape object
 */
public class Shape {
    /**
     * Represents the type of shape (square, rectangle, triangle, etc.)
     */
    private String name;

    /**
     * Represents the color of the shape (Red, Blue, Green, etc.)
     */
    private String color;

    /**
     * Represents the number of sides of the shape (0, 3, 4, etc.)
     */
    private int sides;

    /**
     * Constructor to initialize the shape object with specified name, color, and number of sides
     * @param name - type of shape
     * @param color - color of the shape
     * @param sides - number of sides of the shape
     */
    public Shape(String name, String color, int sides) {
        setName(name);
        setColor(color);
        setSides(sides);
    }

    /**
     * Gets the name (type) of the shape
     * @return name of the shape (type of shape)
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name (type) of the shape
     * @param name - type of shape
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the color of the shape
     * @return color of the shape
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the shape
     * @param color - color of the shape
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets the number of sides of the shape
     * @return number of sides of the shape
     */
    public int getSides() {
        return sides;
    }

    /**
     * Sets the number of sides of the shape
     * @param sides - number of sides of the shape
     */
    public void setSides(int sides) {
        this.sides = sides;
    }

    /**
     * Compares by value (not reference), two objects to determine if they have the same values
     * @param o - object to compare to
     * @return if the two objects have the same values
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Shape shape = (Shape) o;
        return sides == shape.sides && Objects.equals(name, shape.name) && Objects.equals(color, shape.color);
    }
}