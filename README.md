# IPConfigure Java Programming Test - Colin Henry

## To Run
  * Before running: ./gradlew build
  * To run: run the main method within the Main class (src/main/java/org/example/Main.java)
  * Note: this main class is made to run all of the runner classes for the questions, you can go to these runner classes to get more information about each question and the code execution

## Q1. Inheritance
  * Shape interface for 2D geometric shapes that have perimeter & area
  * Square, Rectangle, & Triangle classes that implement this interface and provide their own concrete implementations
  * Polymorphism: Shape can take many forms, can be a Sqaure, Rectangle, Triangle, etc.

## Q2. Generics
  * Adder generic interface for adding two objects of unknown type
  * AbstractAdder generic abstract class that implements this interface without providing concrete implementation
  * IntegerAdder, DoubleAdder, & StringAdder classes that extend this abstract class and provide their own concrete implementations
  * Strong type checking: uses generic interface/abstract class and concrete classes require strict object types to execute the add method
  * Code reuse: classes have common interface/abstract class with add method, subclasses reuse this add method and override it with their own concrete implementations

## Q3. Object Comparison
  * Shape class for 2D geometric shapes (not the same as the one from Q1)
  * Compare by reference: ==, compares if two objects have reference/pointers to same memory location (i.e. they are the same object)
  * Compare by value: .equals(), compares if two objects have same field values, but does not require them to both have same references

## Q4. Unit Test and Mocking
  * Child class with dependecy on two Parent classes, mother & father
  * Parent class that represents a parent of a Child class
  * Unit Test: JUnit tests to test only the Child class and not interactions with other classes
  * Mocking: Mockito framework to mock the Parent class dependencies in order to isolate the Child class to perform a unit test, verify that the functions were called

## Q5. GCD
  * CSVReader class to get input and perform gcd calculations (for simplicity I put business logic for gcd in this class, but should separate to follow MVC architecture pattern practices)
  * Concurrency: a lambda expression in the gcd calculation method ensures that each process is executed on a new thread for concurrency

## Notes
  * For all of these questions I assumed that they would receive valid inputs, so they may not consider all edge cases but work for general cases and have all been tested
  * Please read each class for more detailed information about them in the javadoc comments
