package com.amigoscode._5_generics._3_genericclasses;

import java.util.Objects;

/**
 * Exercise: Generic Pair Class
 *
 * This exercise has you build a generic Pair<K, V> class that holds
 * two related values of potentially different types, like a key-value pair.
 *
 * Complete the TODOs below.
 */
public class Pair<K, V> {

    // TODO: 1 - Declare two private fields: one of type K called "key"
    //  and one of type V called "value".


    // TODO: 2 - Create a constructor that takes a K key and a V value
    //  and assigns them to the fields.


    // TODO: 3 - Add getter methods getKey() and getValue() that return
    //  the key and value respectively.


    // TODO: 4 - Create a swap() method that returns a new Pair<V, K> with
    //  the key and value swapped. For example, Pair<String, Integer>("age", 25)
    //  would return Pair<Integer, String>(25, "age").


    // TODO: 5 - Override toString() to return "Pair{key=" + key + ", value=" + value + "}".


    // TODO: 6 - Override equals(Object o) to compare two Pairs based on both
    //  key and value fields. Use Objects.equals() for null-safe comparison.
    //  Also override hashCode() using Objects.hash(key, value).


    public static void main(String[] args) {

        // TODO: 7 - Create a Pair<String, Integer> representing a person's
        //  name and age (e.g., "Alice", 30). Print the pair. Call swap()
        //  and print the swapped pair. Create another pair with the same
        //  name and age, and test equals() between the two.

    }
}
