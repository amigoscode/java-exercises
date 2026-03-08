package com.amigoscode._3_oop._3_abstractclasses;

/**
 * Exercise: Abstract Classes - Rectangle
 *
 * Implement a concrete Rectangle class that extends the abstract Shape.
 * You must implement all abstract methods declared in Shape.
 *
 * Key concepts:
 * - Extending an abstract class
 * - Implementing abstract methods
 * - Working with multiple fields
 */

// TODO: 1 - Make this class extend Shape.
public class Rectangle {

    // TODO: 2 - Declare two private fields:
    //   - width (double)
    //   - height (double)


    // TODO: 3 - Create a constructor that takes width and height.
    //   Validate that both are > 0, throwing IllegalArgumentException if not.
    //   Assign the fields.


    // TODO: 4 - Implement the area() method from Shape.
    //   Formula: width * height
    //   Use the @Override annotation.


    // TODO: 5 - Implement the perimeter() method from Shape.
    //   Formula: 2 * (width + height)
    //   Use the @Override annotation.


    public static void main(String[] args) {
        // Uncomment and test after completing the TODOs:
        // Rectangle rect = new Rectangle(4.0, 6.0);
        // System.out.println("Area: " + rect.area());
        // System.out.println("Perimeter: " + rect.perimeter());
        // rect.describe();   // inherited concrete method from Shape
        // System.out.println(rect);
    }
}
