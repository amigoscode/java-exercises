package com.amigoscode._3_oop._3_abstractclasses;

/**
 * Exercise: Abstract Classes - Circle
 *
 * Implement a concrete Circle class that extends the abstract Shape.
 * You must implement all abstract methods declared in Shape.
 *
 * Key concepts:
 * - Extending an abstract class
 * - Implementing abstract methods
 * - Using Math.PI for calculations
 */

// TODO: 1 - Make this class extend Shape.
public class Circle {

    // TODO: 2 - Declare a private field:
    //   - radius (double)


    // TODO: 3 - Create a constructor that takes a radius.
    //   Validate that radius > 0, throwing IllegalArgumentException if not.
    //   Assign the field.


    // TODO: 4 - Implement the area() method from Shape.
    //   Formula: Math.PI * radius * radius
    //   Use the @Override annotation.


    // TODO: 5 - Implement the perimeter() method from Shape.
    //   Formula: 2 * Math.PI * radius
    //   Use the @Override annotation.


    public static void main(String[] args) {
        // Uncomment and test after completing the TODOs:
        // Circle circle = new Circle(5.0);
        // System.out.println("Area: " + circle.area());
        // System.out.println("Perimeter: " + circle.perimeter());
        // circle.describe();   // inherited concrete method from Shape
        // System.out.println(circle);
    }
}
