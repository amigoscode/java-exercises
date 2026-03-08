package com.amigoscode._6_functionalinterfaces._2_functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Exercise: BiFunction<T, U, R>
 *
 * BiFunction takes two arguments of types T and U and returns a result of type R.
 * Key methods:
 *   - R apply(T t, U u)
 *   - andThen(Function after) chains a Function after the BiFunction
 *
 * Note: BiFunction does NOT have compose() because compose would need to produce
 * two values from one, which is not possible with a single function.
 */
public class BiFunctionExercise {

    public static void main(String[] args) {

        // TODO: 1 - Create a BiFunction<String, String, String> called 'combiner'
        //  that concatenates two strings with a space in between.
        //  Example: ("John", "Doe") -> "John Doe"


        // TODO: 2 - Create a BiFunction<Integer, Integer, Integer> called 'max'
        //  that returns the larger of two integers.
        //  Hint: You can use Math.max or a ternary expression.


        // TODO: 3 - Create a BiFunction<String, Integer, String> called 'repeat'
        //  that repeats a string N times.
        //  Example: ("Ha", 3) -> "HaHaHa"
        //  Hint: Use String.repeat(int) or a loop inside the lambda.


        // TODO: 4 - Use andThen() to chain 'combiner' with a Function<String, Integer>
        //  that returns the length of the combined string.
        //  Apply it to ("Hello", "World") and print the result.
        //  Expected: 11 (length of "Hello World")


        List<String> firstNames = Arrays.asList("Alice", "Bob", "Charlie");
        List<Integer> ages = Arrays.asList(30, 25, 35);

        // TODO: 5 - Create a BiFunction<String, Integer, String> called 'describe'
        //  that formats a name and age as "<name> is <age> years old".
        //  Then use IntStream.range to combine firstNames and ages element-wise,
        //  producing a List<String>. Print the result.
        //  Hint: IntStream.range(0, firstNames.size())
        //          .mapToObj(i -> describe.apply(firstNames.get(i), ages.get(i)))
        //          .collect(Collectors.toList())

    }
}
