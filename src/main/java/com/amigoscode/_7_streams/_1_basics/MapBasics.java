package com.amigoscode._7_streams._1_basics;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Exercise: Map Basics
 *
 * Learn how to use the map() intermediate operation to transform
 * each element of a stream into a different value or type.
 */
public class MapBasics {

    public static void main(String[] args) {
        List<String> names = List.of("alice", "bob", "charlie", "diana", "eve");
        List<String> words = List.of("Java", "Streams", "Are", "Powerful", "Tools");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> numberStrings = List.of("10", "20", "30", "40", "50");

        // TODO: 1 - Map 'names' to uppercase and print each result
        //           Use String::toUpperCase


        // TODO: 2 - Map 'words' to their lengths (String -> Integer)
        //           Print each length


        // TODO: 3 - Map 'numbers' to their squares (n -> n * n)
        //           Print each squared value


        // TODO: 4 - Map 'names' to greeting strings: "Hello, {name}!"
        //           where name should be capitalized (first letter uppercase, rest lowercase)
        //           Print each greeting


        // TODO: 5 - Chain map and filter: take 'numbers', filter to keep only even numbers,
        //           then map each to its cube (n * n * n)
        //           Print each result


        // TODO: 6 - Map 'numberStrings' from String to Integer using Integer::parseInt
        //           Then collect to a List and print the list

    }
}
