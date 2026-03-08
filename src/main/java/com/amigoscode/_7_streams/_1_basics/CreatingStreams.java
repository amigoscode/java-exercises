package com.amigoscode._7_streams._1_basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Exercise: Creating Streams
 *
 * Learn the different ways to create streams in Java.
 * Streams can be created from collections, arrays, individual values,
 * strings, and even generated infinitely.
 */
public class CreatingStreams {

    public static void main(String[] args) {
        // Setup data
        List<String> names = List.of("Alice", "Bob", "Charlie", "Diana", "Eve");
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        String sentence = "Hello";

        // TODO: 1 - Create a stream from the 'names' list and print each element
        //           Use the .stream() method on the list
        names.stream().forEach(System.out::println);

        // TODO: 2 - Create a stream from the 'fruits' array using Arrays.stream()
        //           and print each element
        Arrays.stream(fruits).forEach(System.out::println);

        // TODO: 3 - Create a stream using Stream.of() with the values "Red", "Green", "Blue"
        //           and print each element
        Stream.of("Red", "Green", "Blue").forEach(System.out::println);

        // TODO: 4 - Create an empty stream using Stream.empty()
        //           Print its count to verify it has 0 elements
        System.out.println(Stream.empty().count());

        // TODO: 5 - Create a stream of characters from the 'sentence' string
        //           Use sentence.chars() to get an IntStream, then print each character
        //           Hint: Use .mapToObj(c -> (char) c) to convert int to char
        sentence.chars().mapToObj(c -> (char) c).forEach(System.out::println);

        // TODO: 6 - Create an infinite stream using Stream.generate() that generates
        //           random integers between 0 and 100. Limit it to 10 elements and print them.
        //           Hint: Use Math.random() and limit()
        Stream.generate(() -> (int) (Math.random() * 100)).limit(10).forEach(System.out::println);

    }
}
