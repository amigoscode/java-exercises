package com.amigoscode._6_functionalinterfaces._2_functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Exercise: Predicate<T> and BiPredicate<T, U>
 *
 * Predicate represents a boolean-valued function of one argument. It is commonly
 * used for filtering and conditional logic. Key methods:
 *   - boolean test(T t)
 *   - and(Predicate other)    logical AND
 *   - or(Predicate other)     logical OR
 *   - negate()                logical NOT
 *
 * BiPredicate takes two arguments and returns a boolean.
 */
public class PredicateExercise {

    public static void main(String[] args) {

        // TODO: 1 - Create a Predicate<Integer> called 'isPositive' that
        //  returns true if the number is greater than 0.


        // TODO: 2 - Create a Predicate<String> called 'isNotEmpty' that
        //  returns true if the string is not null and not empty.
        //  Hint: s -> s != null && !s.isEmpty()


        // TODO: 3 - Create a Predicate<Integer> called 'isEven' that returns
        //  true if the number is even. Then combine 'isPositive' and 'isEven'
        //  using and() to create 'isPositiveAndEven'. Test it with values
        //  4, -2, 3, and 0.


        // TODO: 4 - Create a Predicate<Integer> called 'isMultipleOf3' that
        //  returns true if the number is divisible by 3. Combine 'isEven' and
        //  'isMultipleOf3' using or() to create 'isEvenOrMultipleOf3'.
        //  Test it with values 4, 9, 7, and 6.


        // TODO: 5 - Use negate() on 'isPositive' to create 'isNotPositive'.
        //  Test it with values 5, -3, and 0.


        List<Integer> numbers = Arrays.asList(-5, -2, 0, 1, 3, 6, 8, 11, 15, -7);

        // TODO: 6 - Use 'isPositiveAndEven' (from TODO 3) to filter the
        //  numbers list. Store the result in a List<Integer> and print it.
        //  Hint: numbers.stream().filter(isPositiveAndEven).collect(...)


        // TODO: 7 - Create a BiPredicate<String, Integer> called 'hasLength'
        //  that returns true if the string's length equals the given integer.
        //  Test it with ("hello", 5) and ("hi", 3). Print the results.

    }
}
