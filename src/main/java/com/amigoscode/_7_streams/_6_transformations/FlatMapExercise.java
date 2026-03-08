package com.amigoscode._7_streams._6_transformations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Exercise: FlatMap
 *
 * Learn how to use flatMap() to flatten nested structures.
 * flatMap transforms each element into a stream and then merges
 * all those streams into a single flat stream.
 */
public class FlatMapExercise {

    record Department(String name, List<Employee> employees) {}

    record Employee(String name, double salary) {}

    public static void main(String[] args) {
        List<List<String>> nestedLists = List.of(
                List.of("Java", "Kotlin"),
                List.of("Python", "Ruby"),
                List.of("JavaScript", "TypeScript")
        );

        String[][] arrayOfArrays = {
                {"Red", "Green"},
                {"Blue", "Yellow"},
                {"Black", "White"}
        };

        List<String> words = List.of("Hello", "World", "Java");

        List<Optional<String>> optionals = List.of(
                Optional.of("Alice"),
                Optional.empty(),
                Optional.of("Bob"),
                Optional.empty(),
                Optional.of("Charlie")
        );

        List<Department> departments = List.of(
                new Department("Engineering", List.of(
                        new Employee("Alice", 95000),
                        new Employee("Bob", 88000)
                )),
                new Department("Marketing", List.of(
                        new Employee("Charlie", 72000),
                        new Employee("Diana", 78000)
                )),
                new Department("Sales", List.of(
                        new Employee("Eve", 68000)
                ))
        );

        int[][] nestedInts = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};

        // TODO: 1 - Flatten 'nestedLists' (List<List<String>>) into a single stream
        //           of strings using flatMap
        //           Print each language


        // TODO: 2 - Flatten 'arrayOfArrays' (String[][]) using flatMap with Arrays::stream
        //           Print each color


        // TODO: 3 - Use flatMap to get all individual characters from 'words'
        //           Hint: Map each word to a stream of its characters using
        //           word.chars().mapToObj(c -> (char) c)
        //           Print each character


        // TODO: 4 - Use flatMap with Optional values:
        //           From 'optionals', extract only the present values using
        //           flatMap(opt -> opt.stream())  or  Optional::stream
        //           Print each name


        // TODO: 5 - Flatten nested objects: from 'departments', get all employees
        //           Use flatMap to go from Department -> stream of Employees
        //           Print each employee's name and salary


        // TODO: 6 - Use flatMapToInt to flatten 'nestedInts' into a single IntStream
        //           Calculate and print the sum of all numbers
        //           Hint: Arrays.stream(nestedInts).flatMapToInt(Arrays::stream)


        // TODO: 7 - Combine flatMap with other operations:
        //           From 'departments', get all employees with salary > 75000
        //           Collect their names to a list and print it

    }
}
