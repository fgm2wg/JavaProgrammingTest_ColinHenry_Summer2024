package org.example;

import org.example.Q1_Inheritance.InheritanceRunner;
import org.example.Q2_Generics.GenericsRunner;
import org.example.Q3_ObjectComparison.ObjectComparisonRunner;
import org.example.Q4_UnitTestAndMocking.UnitTestAndMockingRunner;
import org.example.Q5_GCD.GCDRunner;

public class Main {
    /**
     * Main method to execute code for every question, can visit each runner class to get more information about the code for each question
     */
    public static void main(String[] args) throws InterruptedException {
        // Question 1. Inheritance
        InheritanceRunner.run();

        // Question 2. Generics
        GenericsRunner.run();

        // Question 3. Object Comparison
        ObjectComparisonRunner.run();

        // Question 4. Unit Test & Mocking
        UnitTestAndMockingRunner.run();

        // Question 5. GCD
        GCDRunner.run();
    }
}