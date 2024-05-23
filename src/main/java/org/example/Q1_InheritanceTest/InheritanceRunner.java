package org.example.Q1_InheritanceTest;

import java.util.List;

public class InheritanceRunner {
    /**
     * Demonstrates polymorphism through the interface Shape being able to take the form of multiple different derived shape classes
     * It specifies which form the Shape object should take at runtime and uses the concrete implementations defined in the derived shape classes
     */
    public static void main(String[] args) {
        System.out.println("###########################################\n");
        System.out.println("--------- Question 1. Inheritance ---------");

        Shape square = new Square(5);
        Shape rect = new Rectangle(4, 5);
        Shape triangle = new Triangle(3, 4, 5);

        List<Shape> shapes = List.of(square, rect, triangle);
        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape);
            System.out.println("Perimeter: " + shape.perimeter());
            System.out.println("Area: " + shape.area());
            System.out.println("Sides: " + shape.getSides() + "\n");
        }

        System.out.println("###########################################");
    }
}