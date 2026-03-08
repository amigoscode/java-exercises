package com.amigoscode._3_oop._1_encapsulation;

/**
 * Exercise: Immutability
 *
 * Learn how to create an immutable class — an object whose state cannot
 * be changed after creation. Immutable objects are thread-safe and
 * easier to reason about.
 *
 * Key concepts:
 * - Private final fields
 * - No setters
 * - "with" methods that return new instances instead of modifying state
 * - Defensive copying (when applicable)
 */
public final class ImmutablePerson {

    // TODO: 1 - Declare three private final fields:
    //   - name (String)
    //   - age (int)
    //   - email (String)


    // TODO: 2 - Create a constructor that takes name, age, and email
    //   and assigns them to the fields. Since the fields are final,
    //   they can only be set here.


    // TODO: 3 - Create getter methods for all three fields:
    //   getName(), getAge(), getEmail().
    //   Do NOT create any setter methods — this class is immutable.


    // TODO: 4 - Create a withName(String newName) method that returns
    //   a NEW ImmutablePerson with the changed name but the same
    //   age and email. The original object must remain unchanged.


    // TODO: 5 - Create a withAge(int newAge) method that returns
    //   a NEW ImmutablePerson with the changed age but the same
    //   name and email. The original object must remain unchanged.


    // TODO: 6 - Override toString() to return a string in the format:
    //   "ImmutablePerson{name='XXX', age=XXX, email='XXX'}"


    public static void main(String[] args) {
        // Uncomment and test after completing the TODOs:
        // ImmutablePerson person = new ImmutablePerson("Alice", 30, "alice@example.com");
        // System.out.println(person);
        //
        // // withName returns a NEW object — original is unchanged
        // ImmutablePerson renamed = person.withName("Bob");
        // System.out.println("Original: " + person);
        // System.out.println("Renamed:  " + renamed);
        //
        // // withAge returns a NEW object — original is unchanged
        // ImmutablePerson aged = person.withAge(31);
        // System.out.println("Original: " + person);
        // System.out.println("Aged:     " + aged);
    }
}
