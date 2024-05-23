package org.example.Q2_Generics;

/**
 * Generic interface for a method to add two unknown object types together (Integer/Double/String/etc.)
 * @param <T> - generic object, i.e. the type of the object which will later be defined
 */
public interface Adder<T> {
    /**
     * Adds two unknown object types together
     * @param obj1 - first generic object
     * @param obj2 - second generic object (object to be added)
     * @return addition of second object onto first object (obj1 + obj2)
     */
    T add(T obj1, T obj2);
}