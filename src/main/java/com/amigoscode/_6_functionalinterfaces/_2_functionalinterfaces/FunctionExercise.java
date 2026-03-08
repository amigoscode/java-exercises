package com.amigoscode._6_functionalinterfaces._2_functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise: Function<T, R>
 *
 * The Function interface represents a function that takes one argument of type T
 * and returns a result of type R. Key methods:
 *   - R apply(T t)           applies the function
 *   - andThen(Function after) first this, then after
 *   - compose(Function before) first before, then this
 */
public class FunctionExercise {

    public static void main(String[] args) {

        // TODO: 1 - Create a Function<String, Integer> called 'stringLength'
        //  that returns the length of a string.


        // TODO: 2 - Create a Function<String, String> called 'toUpperCase'
        //  that converts a string to uppercase.


        // TODO: 3 - Chain 'toUpperCase' and 'stringLength' using andThen() to
        //  create a new function that first converts to uppercase, then gets
        //  the length. Apply it to "hello" and print the result.
        //  Hint: toUpperCase.andThen(stringLength)


        // TODO: 4 - Chain 'stringLength' and 'toUpperCase' using compose() to
        //  achieve the same result as TODO 3. Apply it to "hello" and print.
        //  Hint: stringLength.compose(toUpperCase)
        //  Note: compose applies the argument function FIRST.


        // TODO: 5 - Create a Function<Integer, String> called 'intToWord' that
        //  converts integers 1-5 to their English word ("one", "two", ..., "five").
        //  For any other number, return "unknown".
        //  Hint: You can use a switch expression or if-else chain.


        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        // TODO: 6 - Use your 'stringLength' function to transform each element
        //  of the 'words' list into its length. Store the result in a
        //  List<Integer> called 'lengths' and print it.
        //  Hint: Use words.stream().map(stringLength).collect(...)


        // TODO: 7 - Call the applyFunction method below, passing stringLength
        //  and the string "Functional Programming". Print the result.

    }

    /**
     * Applies the given function to the input value and returns the result.
     *
     * @param function the function to apply
     * @param input    the input value
     * @param <T>      input type
     * @param <R>      result type
     * @return the result of applying the function
     */
    static <T, R> R applyFunction(Function<T, R> function, T input) {
        return function.apply(input);
    }
}
