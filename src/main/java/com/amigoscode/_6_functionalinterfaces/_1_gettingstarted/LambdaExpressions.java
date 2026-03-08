package com.amigoscode._6_functionalinterfaces._1_gettingstarted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;

/**
 * Exercise: Lambda Expressions
 *
 * Practice writing lambdas for various standard functional interfaces:
 * Comparator, Runnable, Callable, and BiFunction. Learn to simplify
 * multi-line lambdas and pass them directly to methods.
 */
public class LambdaExpressions {

    public static void main(String[] args) throws Exception {

        List<String> names = Arrays.asList("Charlie", "Al", "Bob", "Alexandra");

        // TODO: 1 - Create a Comparator<String> as a lambda that compares strings
        //  by their length (shorter strings first). Use it to sort the names list.
        //  Hint: Use names.sort(...) or Collections.sort(names, ...)


        System.out.println("Sorted by length: " + names);

        // TODO: 2 - Create a Runnable as a lambda that prints
        //  "Running in a lambda!" to the console. Then execute it by calling run().


        // TODO: 3 - Create a Callable<String> as a lambda that returns
        //  "Result from Callable". Then call it using call() and print the result.


        // TODO: 4 - The following multi-line lambda calculates the sum of two
        //  integers. Rewrite it as a single-expression lambda (no curly braces,
        //  no return keyword). Assign it to a variable called sumShort.
        BiFunction<Integer, Integer, Integer> sumVerbose = (Integer a, Integer b) -> {
            int result = a + b;
            return result;
        };
        System.out.println("Verbose sum: " + sumVerbose.apply(3, 4));


        // TODO: 5 - Create a BiFunction<String, String, String> lambda that
        //  concatenates two strings with " + " in between.
        //  Example: ("Hello", "World") -> "Hello + World"


        // TODO: 6 - Store a lambda in a variable called 'exclaim' of type
        //  java.util.function.Function<String, String> that appends "!" to
        //  any string. Then reuse it: apply it to "Hello" and "Goodbye",
        //  printing both results.


        // TODO: 7 - Call the processName method below, passing a lambda directly
        //  (not stored in a variable) that converts a name to uppercase.
        //  Print the result.

    }

    /**
     * Applies the given function to the provided name and returns the result.
     *
     * @param name      the input name
     * @param processor a function that transforms the name
     * @return the transformed name
     */
    static String processName(String name, java.util.function.Function<String, String> processor) {
        return processor.apply(name);
    }
}
