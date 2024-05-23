package org.example.Q2_Generics;

/**
 * String specific class to provide concrete implementation for adding two string objects
 */
public class StringAdder extends AbstractAdder<String> {
    /**
     * Adds two String objects together
     * @param str1 - first String
     * @param str2 - second String (String to be added)
     * @return concatenation of the two Strings (str1 + str2)
     */
    @Override
    public String add(String str1, String str2) {
        return str1 + str2;
    }
}