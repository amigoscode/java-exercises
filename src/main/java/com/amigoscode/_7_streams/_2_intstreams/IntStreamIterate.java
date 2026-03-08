package com.amigoscode._7_streams._2_intstreams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * Exercise: IntStream.iterate and Specialized Streams
 *
 * Learn how to use IntStream.iterate() to generate sequences,
 * and explore LongStream and DoubleStream for other primitive types.
 */
public class IntStreamIterate {

    public static void main(String[] args) {

        // TODO: 1 - Use IntStream.iterate to generate the first 10 even numbers
        //           starting from 0 (0, 2, 4, 6, ..., 18)
        //           Use iterate(seed, unaryOperator) with limit(10)
        //           Print each number


        // TODO: 2 - Use the 3-argument IntStream.iterate(seed, hasNext, next)
        //           to generate numbers from 1 to 100 that are multiples of 7
        //           The hasNext predicate should stop when the value exceeds 100
        //           Print each number


        // TODO: 3 - Use IntStream.iterate to generate a Fibonacci-like sequence
        //           Since iterate works with single values, use a trick:
        //           Create a stream of the first 10 Fibonacci numbers
        //           Hint: You can use an int array {a, b} and iterate with
        //           Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
        //           then mapToInt(f -> f[0])
        //           Print each number


        // TODO: 4 - Use LongStream.range to generate numbers from 1 to 1_000_000
        //           Calculate and print the sum
        //           This demonstrates why LongStream exists (the sum exceeds int range)


        // TODO: 5 - Use DoubleStream to generate 5 random numbers between 0.0 and 1.0
        //           Use DoubleStream.generate(Math::random).limit(5)
        //           Print each number formatted to 4 decimal places
        //           Hint: Use forEach(d -> System.out.printf("%.4f%n", d))

    }
}
