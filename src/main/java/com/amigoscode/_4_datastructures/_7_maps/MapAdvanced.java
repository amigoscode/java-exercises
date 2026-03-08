package com.amigoscode._4_datastructures._7_maps;

// Exercise: Advanced Map Operations (Java 8+)
// Learn modern Map methods: getOrDefault, putIfAbsent, computeIfAbsent, merge, replaceAll, and immutable maps.

import java.util.HashMap;
import java.util.Map;

public class MapAdvanced {

    public static void main(String[] args) {

        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 78);
        System.out.println("Initial map: " + scores);

        // TODO: 1 - Use getOrDefault() to get the score for "Diana" (who is not in the map)
        //           Use a default value of 0
        //           Also get the score for "Alice" using getOrDefault with default 0
        //           Print both results


        // TODO: 2 - Use putIfAbsent() to try adding "Bob" with value 100
        //           Then use putIfAbsent() to add "Diana" with value 92
        //           Print the map - Bob's value should remain 85, Diana should be added


        // TODO: 3 - Use computeIfAbsent() to add "Eve" with a computed value
        //           The computation: the key's length * 10 (so "Eve" -> 3 * 10 = 30)
        //           Print the map after the operation


        // TODO: 4 - Use merge() to add 5 bonus points to "Charlie"'s score
        //           merge("Charlie", 5, Integer::sum) adds 5 to the existing value
        //           Also merge "Frank" with value 88 (new entry since key doesn't exist)
        //           Print the map


        // TODO: 5 - Use replaceAll() to add 10 points to every student's score
        //           replaceAll takes a BiFunction (key, value) -> newValue
        //           Print the map after the operation


        // TODO: 6 - Create an immutable map using Map.of() with 3 entries:
        //           "Math" -> 95, "Science" -> 88, "English" -> 92
        //           Print the immutable map
        //           Try adding to it (will throw UnsupportedOperationException) - wrap in try-catch

    }
}
