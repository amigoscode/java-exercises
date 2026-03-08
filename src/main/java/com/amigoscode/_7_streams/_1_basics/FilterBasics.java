package com.amigoscode._7_streams._1_basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Exercise: Filter Basics
 *
 * Learn how to use the filter() intermediate operation to select
 * elements from a stream that match a given condition (predicate).
 */
public class FilterBasics {

    public static void main(String[] args) {
        List<String> words = List.of("stream", "api", "lambda", "collection", "filter", "map", "reduce");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> cities = List.of("Amsterdam", "Berlin", "Athens", "Barcelona", "Copenhagen", "Auckland");
        List<String> withNulls = Arrays.asList("Hello", null, "World", null, "Java", "Streams", null);

        // TODO: 1 - Filter 'words' keeping only strings with length > 5
        //           Print each matching word
        words.stream().filter(w -> w.length() > 5).forEach(System.out::println);

        // TODO: 2 - Filter 'numbers' keeping only even numbers
        //           Print each even number
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        // TODO: 3 - Filter 'cities' keeping only those starting with "A"
        //           Print each matching city
        cities.stream().filter(c -> c.startsWith("A")).forEach(System.out::println);

        // TODO: 4 - Chain two filters on 'words': first keep words with length > 3,
        //           then keep only words that contain the letter "a"
        //           Print each matching word
        words.stream().filter(w -> w.length() > 3).filter(w -> w.contains("a")).forEach(System.out::println);

        // TODO: 5 - Filter null values from 'withNulls' list
        //           Print each non-null element
        //           Hint: Use Objects::nonNull or a lambda
        withNulls.stream().filter(java.util.Objects::nonNull).forEach(System.out::println);

        // TODO: 6 - Filter 'numbers' to keep only numbers greater than 5,
        //           then collect the results to a new List and print the list
        //           Use Collectors.toList()
        List<Integer> greaterThanFive = numbers.stream().filter(n -> n > 5).collect(Collectors.toList());
        System.out.println(greaterThanFive);

    }
}
