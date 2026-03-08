package com.amigoscode._7_streams._1_basics;

import java.util.List;
import java.util.Optional;

/**
 * Exercise: Reduce Basics
 *
 * Learn how to use the reduce() terminal operation to combine all elements
 * of a stream into a single result. Reduce is one of the most powerful
 * stream operations and can express many computations.
 */
public class ReduceBasics {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> factors = List.of(2, 3, 4, 5);
        List<String> words = List.of("Java", "Streams", "Are", "Awesome");

        // TODO: 1 - Use reduce to sum all elements of 'numbers'
        //           Use the two-argument reduce(identity, accumulator)
        //           Print the result


        // TODO: 2 - Use reduce to find the product of all elements in 'factors'
        //           Print the result (should be 2 * 3 * 4 * 5 = 120)


        // TODO: 3 - Use reduce to concatenate all 'words' with a space separator
        //           Use the single-argument reduce(accumulator) which returns Optional
        //           Print the result (should be "Java Streams Are Awesome")


        // TODO: 4 - Use reduce with identity value 0 to sum 'numbers'
        //           Compare this with the Optional version - this one returns int directly
        //           Print the result


        // TODO: 5 - Use reduce to find the longest string in 'words'
        //           Compare strings by their length in the accumulator
        //           Print the result


        // TODO: 6 - Implement a custom accumulator with reduce to calculate
        //           the sum of squares of 'numbers' (1^2 + 2^2 + 3^2 + ... + 10^2)
        //           Use the identity value 0
        //           Print the result (should be 385)

    }
}
