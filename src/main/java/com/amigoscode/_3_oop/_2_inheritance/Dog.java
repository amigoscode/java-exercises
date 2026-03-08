package com.amigoscode._3_oop._2_inheritance;

/**
 * Exercise: Inheritance - Subclass
 *
 * Create a Dog class that extends Animal. Practice using super()
 * to call the parent constructor, overriding methods, and adding
 * behavior specific to the subclass.
 *
 * Key concepts:
 * - Extending a parent class
 * - Calling super() in the constructor
 * - Overriding methods with @Override
 * - Adding subclass-specific fields and methods
 */

// TODO: 1 - Make this class extend Animal.
//   Change the class declaration so Dog inherits from Animal.
public class Dog {

    // TODO: 2 - Add a private field:
    //   - breed (String)


    // TODO: 3 - Create a constructor that takes name, age, and breed.
    //   Call super(name, age) to initialize the parent fields,
    //   then set the breed field.


    // TODO: 4 - Override the makeSound() method to print:
    //   "<name> says: Woof! Woof!"
    //   Use the @Override annotation. You can access `name` because
    //   it is a protected field in Animal.


    // TODO: 5 - Add a fetch(String item) method specific to Dog.
    //   This method should print:
    //   "<name> fetches the <item>!"
    //   This method does not exist in Animal — it is unique to Dog.


    // TODO: 6 - Override toString() to return:
    //   "Dog{name='XXX', age=XXX, breed='XXX'}"


    public static void main(String[] args) {
        // Uncomment and test after completing the TODOs:
        // Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        // System.out.println(dog);
        // dog.makeSound();
        // dog.eat("kibble");       // inherited from Animal
        // dog.fetch("tennis ball"); // specific to Dog
        //
        // // Polymorphism: a Dog IS-AN Animal
        // Animal animal = new Dog("Rex", 5, "German Shepherd");
        // animal.makeSound(); // calls Dog's overridden version
    }
}
