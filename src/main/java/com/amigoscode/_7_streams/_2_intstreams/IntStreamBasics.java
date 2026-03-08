package com.amigoscode._7_streams._2_intstreams;

import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Exercise: IntStream Basics
 *
 * Learn how to use IntStream, a specialized stream for int primitives.
 * IntStream avoids boxing overhead and provides useful numeric operations
 * like sum(), average(), min(), and max().
 */
public class IntStreamBasics {

    public static void main(String[] args) {

        // TODO: 1 - Create an IntStream using IntStream.range(1, 11)
        //           This generates numbers 1 to 10 (end exclusive)
        //           Print each number using forEach


        // TODO: 2 - Create an IntStream using IntStream.rangeClosed(1, 10)
        //           Calculate and print the sum of all numbers (should be 55)


        // TODO: 3 - Create an IntStream.rangeClosed(1, 5) and convert it to
        //           a Stream<Integer> using boxed()
        //           Collect the result to a List<Integer> and print it


        // TODO: 4 - Create an IntStream using IntStream.of(10, 20, 30, 40, 50)
        //           Print each value


        // TODO: 5 - Create an IntStream of the values 85, 90, 78, 92, 88
        //           Calculate and print the average using .average()
        //           Remember: average() returns OptionalDouble, use getAsDouble() or orElse()


        // TODO: 6 - Create an IntStream of the values 15, 3, 42, 7, 28
        //           Find and print both the min and max values
        //           Note: You cannot reuse a stream, so create the IntStream twice
        //           or use summaryStatistics()

    }
}
