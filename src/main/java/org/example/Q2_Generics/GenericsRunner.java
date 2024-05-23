package org.example.Q2_Generics;

public class GenericsRunner {
    /**
     * Demonstrates strong type checking by requiring specific object type for each class (IntegerAdder, DoubleAdder, StringAdder)
     * You can only add two object types of the corresponding type, will not allow you to use other types, so it ensures type safety and avoids compilation errors
     * Demonstrates code reuse by having a common interface & abstract class that each class extends and provides their own concrete implementation
     * This allows the same add() method to be reused and overridden for different data types subclasses
     */
    public static void run() {
        System.out.println("----------- Question 2. Generics ----------");

        IntegerAdder intAdder = new IntegerAdder();
        System.out.println("5 + 10 = " + intAdder.add(5, 10));

        DoubleAdder doubleAdder = new DoubleAdder();
        System.out.println("5.0 + 10.0 = " + doubleAdder.add(5.0, 10.0));

        StringAdder strAdder = new StringAdder();
        System.out.println("'Hello' + ' World!': " + strAdder.add("Hello", " World!"));

        System.out.println("\n###########################################\n");
    }
}