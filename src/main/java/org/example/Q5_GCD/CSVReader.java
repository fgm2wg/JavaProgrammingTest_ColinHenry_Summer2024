package org.example.Q5_GCD;

import org.example.Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents the manager class to deal with getting input from input.csv file and calculating the gcd for each integer pair
 */
public class CSVReader {
    /**
     * Reads lines from the csv input file and calls the calculate gcd method to find gcd for each integer pair
     */
    public void readLines() {
        List<List<Integer>> intPairs = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/input.csv"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                var splitLine = line.split(",");
                int int1 = Integer.parseInt(splitLine[0].strip());
                int int2 = Integer.parseInt(splitLine[1].strip());
                intPairs.add(List.of(int1, int2));
            }
            calculateGCD(intPairs);
        }
        catch (IOException e) {
            System.out.println("Error while reading input: " + e.getMessage());
        }
    }

    /**
     * Calculates the gcd for each integer pair by using a lambda body to execute on a new thread for each pair and calling gcd method
     * This currently does not run in the order of intPairs so that it can run on multiple threads at the same time for concurrency and to increase performance
     * If you want it to run in order, could simply add a try catch with thread.join() to wait for each process to finish before executing next
     * @param intPairs - list of all integer pairs (nested arraylist of integers)
     */
    public void calculateGCD(List<List<Integer>> intPairs) {
        intPairs.forEach(e -> {
            Thread thread = new Thread(() -> {
                int int1 = e.get(0);
                int int2 = e.get(1);
                int gcd = gcd(int1, int2);
                System.out.println("gcd(" + int1 + ", " + int2 + ") = " + gcd);
            });
            thread.start();
        });
    }

    /**
     * Calculates the gcd of two integer, int1 & int2
     * If second integer is 0, then gcd is just the first integer (0 divisible by any number)
     * Otherwise, recursively call gcd with second integer and the result of the modulo of the two integers, int1 % int2
     * @param int1 - first integer
     * @param int2 - second integer
     * @return greatest common divisor for the two integers, gcd(int1, int2)
     */
    public int gcd(int int1, int int2) {
        int1 = Math.abs(int1);
        int2 = Math.abs(int2);
        if (int2 == 0) {
            return int1;
        }
        else {
            return gcd(int2, int1 % int2);
        }
    }
}