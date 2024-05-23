package org.example.Q2_GenericsTest;

import org.example.Q2_Generics.DoubleAdder;
import org.example.Q2_Generics.IntegerAdder;
import org.example.Q2_Generics.StringAdder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTest {
    @Test
    public void testIntegerAdder() {
        IntegerAdder intAdder = new IntegerAdder();
        assertEquals(10, intAdder.add(5, 5));
        assertEquals(0, intAdder.add(-5, 5));
        assertEquals(-10, intAdder.add(-5, -5));
    }

    @Test
    public void testDoubleAdder() {
        DoubleAdder doubleAdder = new DoubleAdder();
        assertEquals(10.0, doubleAdder.add(5.0, 5.0));
        assertEquals(0.0, doubleAdder.add(-5.0, 5.0));
        assertEquals(-10.0, doubleAdder.add(-5.0, -5.0));
    }

    @Test
    public void testStringAdder() {
        StringAdder strAdder = new StringAdder();
        assertEquals("Hello World!", strAdder.add("Hello", " World!"));
        assertEquals("Hello!", strAdder.add("Hel", "lo!"));
        assertEquals("Hello!", strAdder.add("Hello!", ""));
    }
}