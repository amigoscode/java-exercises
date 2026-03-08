package com.amigoscode._6_functionalinterfaces._1_gettingstarted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Exercise: Method References
 *
 * Method references are a shorthand for lambdas that simply call an existing
 * method. There are four kinds:
 *   1. Static method reference:           ClassName::staticMethod
 *   2. Instance method on a specific object: instance::method
 *   3. Instance method on the parameter:  ClassName::instanceMethod
 *   4. Constructor reference:             ClassName::new
 */
public class MethodReferences {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // TODO: 1 - Use a static method reference to create a
        //  Function<Integer, String> that converts an Integer to a String.
        //  Use String::valueOf. Apply it to the number 42 and print the result.


        // TODO: 2 - Use an instance method reference on a specific object to
        //  create a java.util.function.Consumer<String>.
        //  Use System.out::println. Then call accept("Hello from method ref!").


        // TODO: 3 - Use an instance method reference on the parameter to create
        //  a Function<String, String> that calls toUpperCase() on the input string.
        //  Use String::toUpperCase. Apply it to "hello" and print the result.


        // TODO: 4 - Use a constructor reference to create a Supplier<ArrayList<String>>
        //  that creates a new empty ArrayList. Use ArrayList::new.
        //  Call get() and print the resulting list.


        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // TODO: 5 - Use a method reference with forEach to print each name
        //  in the names list. Use System.out::println as the method reference.


        // TODO: 6 - Compare lambda vs method reference side by side.
        //  Create two Function<String, Integer> variables:
        //    a) 'withLambda' using a lambda:          s -> s.length()
        //    b) 'withMethodRef' using method reference: String::length
        //  Apply both to "Hello" and print the results to confirm they are equal.

    }
}
