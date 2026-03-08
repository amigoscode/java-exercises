package com.amigoscode._7_streams._4_duplicates;

import java.util.List;
import java.util.Objects;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * Exercise: Removing Duplicates
 *
 * Learn different ways to remove duplicate elements from a stream
 * using distinct(), collecting to a Set, and custom approaches.
 */
public class DistinctExercise {

    record Person(String name, int age) {}

    public static void main(String[] args) {
        List<Integer> numbersWithDuplicates = List.of(1, 2, 3, 2, 4, 5, 3, 6, 1, 7, 5, 8);
        List<String> mixedCaseNames = List.of("Alice", "bob", "ALICE", "Bob", "charlie", "CHARLIE", "alice");
        List<Person> people = List.of(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Alice", 30),
                new Person("Charlie", 35),
                new Person("Bob", 25)
        );
        List<String> fruits = List.of("banana", "apple", "cherry", "apple", "banana", "date", "cherry");

        // TODO: 1 - Remove duplicates from 'numbersWithDuplicates' using distinct()
        //           Print the resulting unique numbers


        // TODO: 2 - Remove duplicates from 'mixedCaseNames' in a case-insensitive manner
        //           Map all names to lowercase first, then use distinct()
        //           Print the resulting unique names


        // TODO: 3 - Collect 'fruits' to a Set instead of using distinct()
        //           This automatically removes duplicates
        //           Print the resulting set


        // TODO: 4 - Count the number of distinct elements in 'numbersWithDuplicates'
        //           Use distinct() followed by count()
        //           Print the count


        // TODO: 5 - Remove duplicate Person objects from 'people'
        //           Since Person is a record, equals/hashCode are auto-generated
        //           Use distinct() and print each unique person


        // TODO: 6 - Remove duplicates from 'fruits' with custom logic using a TreeSet
        //           collector that ignores case (use String.CASE_INSENSITIVE_ORDER)
        //           Hint: Collectors.toCollection(() -> new TreeSet<>(String.CASE_INSENSITIVE_ORDER))
        //           Print the result

    }
}
