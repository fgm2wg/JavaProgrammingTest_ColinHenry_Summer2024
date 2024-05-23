package org.example.Q4_UnitTestAndMockingTest;

import org.example.Q4_UnitTestAndMocking.Child;
import org.example.Q4_UnitTestAndMocking.Parent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Testing class using JUnit with mocking framework Mockito
 */
public class UnitTestAndMockingTest {
    /**
     * Demonstrates a unit test to check the parent names of the child
     * Since we only want to unit test, we must remove external dependencies by mocking the Parent classes that child relies on
     * Asserts that the name of the parents are correct and verifies that the getName() method was only called once for each parent
     */
    @Test
    public void testChild() {
        Parent mom = mock(Parent.class);
        Parent dad = mock(Parent.class);

        when(mom.getName()).thenReturn("Jane Doe");
        when(dad.getName()).thenReturn("John Doe");

        Child child = new Child(mom, dad);

        assertEquals("Jane Doe", child.getMother().getName());
        assertEquals("John Doe", child.getFather().getName());

        verify(mom, times(1)).getName();
        verify(dad, times(1)).getName();
    }
}