package com.amigoscode._7_streams._9_joiningstrings;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Exercise: Joining Strings
 *
 * Learn how to use Collectors.joining() to concatenate stream elements
 * into a single string with optional separators, prefixes, and suffixes.
 */
public class JoiningExercise {

    record Person(String firstName, String lastName) {}

    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Cherry", "Date", "Elderberry");

        List<Person> people = List.of(
                new Person("Alice", "Smith"),
                new Person("Bob", "Johnson"),
                new Person("Charlie", "Brown"),
                new Person("Diana", "Williams")
        );

        List<String> headers = List.of("Name", "Age", "City", "Email");
        List<String> values = List.of("Alice", "30", "London", "alice@example.com");

        // TODO: 1 - Join 'fruits' with a comma and space separator: ", "
        //           Use Collectors.joining(", ")
        //           Print the result (should be: "Apple, Banana, Cherry, Date, Elderberry")


        // TODO: 2 - Join 'fruits' with comma separator, and add prefix "[" and suffix "]"
        //           Use Collectors.joining(", ", "[", "]")
        //           Print the result (should be: "[Apple, Banana, Cherry, Date, Elderberry]")


        // TODO: 3 - Join full names from 'people' (firstName + " " + lastName)
        //           with " | " separator
        //           Map each Person to their full name first, then join
        //           Print the result


        // TODO: 4 - Join 'fruits' with a newline separator "\n"
        //           This creates a multi-line string with each fruit on its own line
        //           Print the result


        // TODO: 5 - Build a CSV line: join the 'values' list with comma separator
        //           Then do the same for 'headers'
        //           Print the header line first, then the values line
        //           This simulates writing a simple CSV output

    }
}
