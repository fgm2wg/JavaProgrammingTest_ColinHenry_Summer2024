package org.example.Q3_ObjectComparison;

public class ObjectComparisonRunner {
    /**
     * Demonstrates how to compare instances of the Shape class by reference and value
     * Compare by reference involves obj1 == obj2 and checks if two instances have references/pointers to same memory location
     * Compare by value involves obj1.equals(obj2) and checks if two instances have same field values but does not have to have same reference
     */
    public static void run() {
        System.out.println("------ Question 3. Object Comparison ------");

        Shape square = new Shape("Square", "Red", 4);
        Shape square2 = new Shape("Square", "Red", 4);
        Shape square3 = square;
        Shape rect = new Shape("Rectangle", "Blue", 4);

        System.out.println("Compare by reference (==)");
        System.out.println("Different reference and Different Values: " + (square == rect));
        System.out.println("Different reference and Same Values: " + (square == square2));
        System.out.println("Same reference and Same Values: " + (square == square3));

        System.out.println("\nCompare by value (.equals())");
        System.out.println("Different reference and Different Values: " + square.equals(rect));
        System.out.println("Different reference and Same Values: " + square.equals(square2));
        System.out.println("Same reference and Same Values: " + square.equals(square3));


        System.out.println("\n###########################################\n");
    }
}
