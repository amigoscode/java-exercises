package com.amigoscode._7_streams._8_sorting;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Exercise: Sorting Streams
 *
 * Learn how to sort stream elements using sorted(), Comparator.comparing(),
 * reverse order, and multi-criteria sorting with thenComparing().
 */
public class SortingExercise {

    record Person(String name, int age, String city) {}

    public static void main(String[] args) {
        List<String> fruits = List.of("Banana", "Apple", "Cherry", "Date", "Elderberry", "Fig", "Grape");

        List<Person> people = List.of(
                new Person("Charlie", 30, "London"),
                new Person("Alice", 25, "Paris"),
                new Person("Bob", 30, "Berlin"),
                new Person("Diana", 22, "London"),
                new Person("Eve", 25, "Paris"),
                new Person("Frank", 35, "Berlin"),
                new Person("Grace", 22, "London")
        );

        List<String> words = List.of("Java", "Go", "Python", "C", "JavaScript", "Rust", "Kotlin");

        // TODO: 1 - Sort 'fruits' in natural (alphabetical) order
        //           Use sorted() without arguments
        //           Print each fruit
        fruits.stream().sorted().forEach(System.out::println);

        // TODO: 2 - Sort 'words' by their length (shortest first)
        //           Use sorted(Comparator.comparingInt(String::length))
        //           Print each word
        words.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);

        // TODO: 3 - Sort 'people' by age (youngest first)
        //           Print each person's name and age
        people.stream().sorted(Comparator.comparingInt(Person::age))
                .forEach(p -> System.out.println(p.name() + " " + p.age()));

        // TODO: 4 - Sort 'fruits' in reverse alphabetical order
        //           Use Comparator.reverseOrder()
        //           Print each fruit
        fruits.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        // TODO: 5 - Sort 'people' by multiple criteria: first by age, then by name
        //           People with the same age should be sorted alphabetically by name
        //           Print each person
        people.stream().sorted(Comparator.comparingInt(Person::age).thenComparing(Person::name))
                .forEach(System.out::println);

        // TODO: 6 - Sort 'people' using Comparator.comparing() with a key extractor
        //           Sort by city name
        //           Print each person's name and city
        people.stream().sorted(Comparator.comparing(Person::city))
                .forEach(p -> System.out.println(p.name() + " " + p.city()));

        // TODO: 7 - Use thenComparing for secondary sort:
        //           Sort 'people' by city first, then by age descending within each city
        //           Hint: Use Comparator.comparing(Person::city)
        //                 .thenComparing(Comparator.comparingInt(Person::age).reversed())
        //           Collect to a list and print
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::city).thenComparing(Comparator.comparingInt(Person::age).reversed()))
                .collect(Collectors.toList());
        System.out.println(sorted);

    }
}
