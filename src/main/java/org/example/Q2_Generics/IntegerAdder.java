package org.example.Q2_Generics;

/**
 * Integer specific class to provide concrete implementation for adding two integer objects
 */
public class IntegerAdder extends AbstractAdder<Integer> {
    /**
     * Adds two Integer objects together
     * @param int1 - first Integer
     * @param int2 - second Integer (Integer to be added)
     * @return sum of the two Integers (int1 + int2)
     */
    @Override
    public Integer add(Integer int1, Integer int2) {
        return int1 + int2;
    }
}