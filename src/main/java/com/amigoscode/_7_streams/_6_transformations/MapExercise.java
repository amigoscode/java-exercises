package com.amigoscode._7_streams._6_transformations;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Exercise: Map Transformations
 *
 * Practice using map(), mapToInt(), and mapToDouble() to transform
 * stream elements. Learn to chain map operations and use method references.
 */
public class MapExercise {

    record Person(String name, int age, String email) {}

    record PersonDTO(String name, String email) {}

    record Product(String name, double price, int quantity) {}

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Alice", 30, "alice@example.com"),
                new Person("Bob", 25, "bob@example.com"),
                new Person("Charlie", 35, "charlie@example.com"),
                new Person("Diana", 28, "diana@example.com")
        );

        List<Product> products = List.of(
                new Product("Laptop", 999.99, 2),
                new Product("Mouse", 29.99, 10),
                new Product("Keyboard", 79.99, 5),
                new Product("Monitor", 449.99, 3)
        );

        List<String> sentences = List.of(
                "Hello World",
                "Java Streams",
                "Functional Programming"
        );

        // TODO: 1 - Map 'people' to extract just their names
        //           Collect to a list and print it


        // TODO: 2 - Map Person objects to PersonDTO objects (dropping the age field)
        //           Collect to a list and print each DTO


        // TODO: 3 - Use mapToInt to get the ages of all people
        //           Calculate and print the sum of ages


        // TODO: 4 - Use mapToDouble to get all product prices
        //           Calculate and print the sum of prices


        // TODO: 5 - Chain map operations on 'sentences':
        //           First map to lowercase, then map to the first word only (split by space)
        //           Print each result


        // TODO: 6 - Use map with a method reference: map 'sentences' to uppercase
        //           using String::toUpperCase
        //           Collect to a list and print it

    }
}
