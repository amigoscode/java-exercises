package com.amigoscode._3_oop._3_abstractclasses;

/**
 * Exercise: Abstract Classes - Shape
 *
 * Create an abstract Shape class that defines a contract for all shapes.
 * Abstract classes can have both abstract methods (no body — subclasses
 * must implement) and concrete methods (with a body — shared behavior).
 *
 * Key concepts:
 * - Abstract class declaration
 * - Abstract methods (no implementation)
 * - Concrete methods in abstract classes
 * - Forcing subclasses to provide implementations
 */

// TODO: 1 - Make this class abstract by adding the `abstract` keyword.
//   An abstract class cannot be instantiated directly.
public abstract class Shape {

    // TODO: 2 - Declare an abstract method: double area()
    //   Abstract methods have no body — just the signature followed by ;
    //   Every subclass of Shape must implement this method.
    public abstract double area();

    // TODO: 3 - Declare an abstract method: double perimeter()
    //   Every subclass of Shape must implement this method.
    public abstract double perimeter();

    // TODO: 4 - Create a concrete (non-abstract) method: void describe()
    //   This method should print:
    //   "This shape has area: <area()> and perimeter: <perimeter()>"
    //   Note: you can call abstract methods from concrete methods!
    //   At runtime, the subclass implementation will be used.
    public void describe() {
        System.out.println("This shape has area: " + area() + " and perimeter: " + perimeter());
    }

    // TODO: 5 - Override toString() to return:
    //   "Shape[area=<area()>, perimeter=<perimeter()>]"
    //   Use String.format("%.2f", value) to format to 2 decimal places.
    @Override
    public String toString() {
        return "Shape[area=" + String.format("%.2f", area()) + ", perimeter=" + String.format("%.2f", perimeter()) + "]";
    }

}
