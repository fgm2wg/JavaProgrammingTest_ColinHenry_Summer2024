package org.example.Q2_Generics;

/**
 * Double specific class to provide concrete implementation for adding two double objects
 */
public class DoubleAdder extends AbstractAdder<Double> {
    /**
     * Adds two Double objects together
     * @param doub1 - first Double
     * @param doub2 - second Double (Double to be added)
     * @return sum of the two Doubles (doub1 + doub2)
     */
    @Override
    public Double add(Double doub1, Double doub2) {
        return doub1 + doub2;
    }
}