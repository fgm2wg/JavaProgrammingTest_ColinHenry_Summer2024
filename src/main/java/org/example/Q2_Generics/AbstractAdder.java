package org.example.Q2_Generics;

/**
 * Generic abstract class implementing the generic Adder interface (but not providing concrete implementation, only abstract for subclasses to use)
 * @param <T> - generic object, i.e. the type of the object which will later be defined
 */
public abstract class AbstractAdder<T> implements Adder<T> {
    /**
     * Adds two unknown object types together
     * @param obj1 - first generic object
     * @param obj2 - second generic object (object to be added)
     * @return addition of second object onto first object (obj1 + obj2)
     */
    @Override
    public abstract T add(T obj1, T obj2);
}