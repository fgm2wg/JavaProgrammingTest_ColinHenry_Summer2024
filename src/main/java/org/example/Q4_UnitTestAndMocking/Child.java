package org.example.Q4_UnitTestAndMocking;

/**
 * Represents a child with two parents, mother and father
 */
public class Child {
    /**
     * Represents the child's mother
     */
    private Parent mother;

    /**
     * Represents the child's father
     */
    private Parent father;

    /**
     * Constructor to initialize the child with specified parents, mom and dad
     * Requires the two dependencies, mom and dad, parent classes
     * @param mom - mother of the child
     * @param dad - father of the child
     */
    public Child(Parent mom, Parent dad) {
        setMother(mom);
        setFather(dad);
    }

    /**
     * Gets the mother of the child
     * @return mother of the child
     */
    public Parent getMother() {
        return mother;
    }

    /**
     * Sets the mother of the child
     * @param mother - mother of the child
     */
    public void setMother(Parent mother) {
        this.mother = mother;
    }

    /**
     * Gets the father of the child
     * @return father of the child
     */
    public Parent getFather() {
        return father;
    }

    /**
     * Sets the father of the child
     * @param father - father of the child
     */
    public void setFather(Parent father) {
        this.father = father;
    }
}