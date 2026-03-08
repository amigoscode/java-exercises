package com.amigoscode._3_oop._2_inheritance;

/**
 * Exercise: Inheritance - Base Class
 *
 * Create a base Animal class that will serve as the parent for
 * specific animal types. This class defines common behavior
 * shared by all animals.
 *
 * Key concepts:
 * - Defining a base class with shared fields and behavior
 * - Protected vs private fields for inheritance
 * - Methods that subclasses can override
 */
public class Animal {

    // TODO: 1 - Declare two protected fields:
    //   - name (String)
    //   - age (int)


    // TODO: 2 - Create a constructor that takes name and age
    //   and assigns them to the fields.


    // TODO: 3 - Create a makeSound() method that prints:
    //   "Some generic animal sound"
    //   Subclasses will override this with their specific sound.


    // TODO: 4 - Create an eat(String food) method that prints:
    //   "<name> is eating <food>"
    //   For example: "Buddy is eating kibble"


    // TODO: 5 - Override toString() to return:
    //   "Animal{name='XXX', age=XXX}"


    public static void main(String[] args) {
        // Uncomment and test after completing the TODOs:
        // Animal animal = new Animal("Generic", 5);
        // System.out.println(animal);
        // animal.makeSound();
        // animal.eat("food");
    }
}
