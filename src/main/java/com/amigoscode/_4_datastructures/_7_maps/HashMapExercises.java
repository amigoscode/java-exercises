package com.amigoscode._4_datastructures._7_maps;

// Exercise: HashMap Operations
// Learn how to use HashMap - a key-value pair data structure for fast lookups.

import java.util.HashMap;
import java.util.Map;

public class HashMapExercises {

    public static void main(String[] args) {

        // TODO: 1 - Create a HashMap<String, Integer> called 'studentGrades'
        //           This will store student names as keys and their grades as values
        HashMap<String, Integer> studentGrades = new HashMap<>();

        // TODO: 2 - Put 5 entries into the map:
        //           "Alice" -> 92, "Bob" -> 85, "Charlie" -> 78, "Diana" -> 95, "Eve" -> 88
        studentGrades.put("Alice", 92);
        studentGrades.put("Bob", 85);
        studentGrades.put("Charlie", 78);
        studentGrades.put("Diana", 95);
        studentGrades.put("Eve", 88);

        // TODO: 3 - Get the grade for "Charlie" using get() and print it
        System.out.println("Charlie's grade: " + studentGrades.get("Charlie"));

        // TODO: 4 - Check if the key "Bob" exists using containsKey()
        //           Print the result
        System.out.println("Contains Bob: " + studentGrades.containsKey("Bob"));

        // TODO: 5 - Check if the value 95 exists using containsValue()
        //           Print the result
        System.out.println("Contains value 95: " + studentGrades.containsValue(95));

        // TODO: 6 - Remove the entry for "Eve" using remove()
        //           Print the map after removal
        studentGrades.remove("Eve");
        System.out.println(studentGrades);

        // TODO: 7 - Iterate over the entrySet() using a for-each loop
        //           Print each entry in the format: "Student: <name>, Grade: <grade>"
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Grade: " + entry.getValue());
        }

        // TODO: 8 - Iterate over just the keys using keySet() and print them
        //           Then iterate over just the values using values() and print them
        System.out.println("Keys: " + studentGrades.keySet());
        System.out.println("Values: " + studentGrades.values());

    }
}
