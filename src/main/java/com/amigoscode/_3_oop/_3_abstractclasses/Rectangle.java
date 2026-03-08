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
public class Rectangle extends Shape {

    // TODO: 2 - Declare two private fields:
    //   - width (double)
    //   - height (double)
    private double width;
    private double height;

    // TODO: 3 - Create a constructor that takes width and height.
    //   Validate that both are > 0, throwing IllegalArgumentException if not.
    //   Assign the fields.
    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Width and height must be > 0");
        }
        this.width = width;
        this.height = height;
    }

    // TODO: 4 - Implement the area() method from Shape.
    //   Formula: width * height
    //   Use the @Override annotation.
    @Override
    public double area() {
        return width * height;
    }

    // TODO: 5 - Implement the perimeter() method from Shape.
    //   Formula: 2 * (width + height)
    //   Use the @Override annotation.
    @Override
    public double perimeter() {
        return 2 * (width + height);
    }


    public static void main(String[] args) {
        // Uncomment and test after completing the TODOs:
        // Rectangle rect = new Rectangle(4.0, 6.0);
        // System.out.println("Area: " + rect.area());
        // System.out.println("Perimeter: " + rect.perimeter());
        // rect.describe();   // inherited concrete method from Shape
        // System.out.println(rect);
    }
}
