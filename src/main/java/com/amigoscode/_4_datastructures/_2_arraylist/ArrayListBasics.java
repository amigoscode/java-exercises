package com.amigoscode._4_datastructures._2_arraylist;

// Exercise: ArrayList Basics
// Learn the fundamental operations of ArrayList - Java's resizable array implementation.

import java.util.ArrayList;

public class ArrayListBasics {

    public static void main(String[] args) {

        // TODO: 1 - Create an ArrayList of Strings called 'names'
        ArrayList<String> names = new ArrayList<>();

        // TODO: 2 - Add 5 names to the list: "Alice", "Bob", "Charlie", "Diana", "Eve"
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");
        names.add("Eve");

        // TODO: 3 - Get the element at index 2 and print it
        //           Expected output: Charlie
        System.out.println(names.get(2));

        // TODO: 4 - Check if the name "Bob" is in the list using contains()
        //           Print the result (true or false)
        System.out.println(names.contains("Bob"));

        // TODO: 5 - Remove the name "Diana" from the list by value
        //           Print the list after removal
        names.remove("Diana");
        System.out.println(names);

        // TODO: 6 - Get and print the size of the list
        System.out.println("Size: " + names.size());

        // TODO: 7 - Iterate using a for-each loop and print each name
        //           Format: "Name: <name>"
        for (String name : names) {
            System.out.println("Name: " + name);
        }

    }
}
