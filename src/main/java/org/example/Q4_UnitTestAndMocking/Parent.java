package org.example.Q4_UnitTestAndMocking;

/**
 * Represents a parent for a given child
 */
public class Parent {
    /**
     * Represents the full name (first and last) of the parent
     */
    private String name;

    /**
     * Constructor to initialize the parent with a specified name
     * @param name - name of the parent
     */
    public Parent(String name) {
        setName(name);
    }

    /**
     * Gets the name of the parent
     * @return name of the parent
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the parent
     * @param name - name of the parent
     */
    public void setName(String name) {
        this.name = name;
    }
}