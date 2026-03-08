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
        Predicate<Integer> isPositive = n -> n > 0;

        // TODO: 2 - Create a Predicate<String> called 'isNotEmpty' that
        //  returns true if the string is not null and not empty.
        //  Hint: s -> s != null && !s.isEmpty()
        Predicate<String> isNotEmpty = s -> s != null && !s.isEmpty();

        // TODO: 3 - Create a Predicate<Integer> called 'isEven' that returns
        //  true if the number is even. Then combine 'isPositive' and 'isEven'
        //  using and() to create 'isPositiveAndEven'. Test it with values
        //  4, -2, 3, and 0.
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isPositiveAndEven = isPositive.and(isEven);
        System.out.println("4: " + isPositiveAndEven.test(4));
        System.out.println("-2: " + isPositiveAndEven.test(-2));
        System.out.println("3: " + isPositiveAndEven.test(3));
        System.out.println("0: " + isPositiveAndEven.test(0));

        // TODO: 4 - Create a Predicate<Integer> called 'isMultipleOf3' that
        //  returns true if the number is divisible by 3. Combine 'isEven' and
        //  'isMultipleOf3' using or() to create 'isEvenOrMultipleOf3'.
        //  Test it with values 4, 9, 7, and 6.
        Predicate<Integer> isMultipleOf3 = n -> n % 3 == 0;
        Predicate<Integer> isEvenOrMultipleOf3 = isEven.or(isMultipleOf3);
        System.out.println("4: " + isEvenOrMultipleOf3.test(4));
        System.out.println("9: " + isEvenOrMultipleOf3.test(9));
        System.out.println("7: " + isEvenOrMultipleOf3.test(7));
        System.out.println("6: " + isEvenOrMultipleOf3.test(6));

        // TODO: 5 - Use negate() on 'isPositive' to create 'isNotPositive'.
        //  Test it with values 5, -3, and 0.
        Predicate<Integer> isNotPositive = isPositive.negate();
        System.out.println("5: " + isNotPositive.test(5));
        System.out.println("-3: " + isNotPositive.test(-3));
        System.out.println("0: " + isNotPositive.test(0));

        List<Integer> numbers = Arrays.asList(-5, -2, 0, 1, 3, 6, 8, 11, 15, -7);

        // TODO: 6 - Use 'isPositiveAndEven' (from TODO 3) to filter the
        //  numbers list. Store the result in a List<Integer> and print it.
        //  Hint: numbers.stream().filter(isPositiveAndEven).collect(...)
        List<Integer> filtered = numbers.stream().filter(isPositiveAndEven).collect(Collectors.toList());
        System.out.println(filtered);

        // TODO: 7 - Create a BiPredicate<String, Integer> called 'hasLength'
        //  that returns true if the string's length equals the given integer.
        //  Test it with ("hello", 5) and ("hi", 3). Print the results.
        BiPredicate<String, Integer> hasLength = (s, len) -> s.length() == len;
        System.out.println("hello,5: " + hasLength.test("hello", 5));
        System.out.println("hi,3: " + hasLength.test("hi", 3));

    }
}
