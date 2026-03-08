package com.amigoscode._6_functionalinterfaces._2_functionalinterfaces;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * Exercise: Supplier<T>
 *
 * Supplier represents a supplier of results. It takes no arguments and returns
 * a value of type T. It is commonly used for lazy initialization, factories,
 * and deferred computation. Key method:
 *   - T get()
 */
public class SupplierExercise {

    public static void main(String[] args) {

        // TODO: 1 - Create a Supplier<String> called 'helloSupplier' that
        //  returns "Hello World". Call get() and print the result.


        // TODO: 2 - Create a Supplier<Double> called 'randomSupplier' that
        //  returns a random number using Math.random(). Call get() three times
        //  and print each result to observe different values.


        // TODO: 3 - Create a Supplier<List<String>> called 'listFactory' that
        //  returns a new empty ArrayList each time get() is called. Call it
        //  twice, add "A" to the first list, and print both lists to show
        //  they are independent.


        // TODO: 4 - Demonstrate lazy initialization: Create a Supplier<String>
        //  called 'expensiveOperation' that prints "Computing..." and then
        //  returns "Result". Show that the message is NOT printed until get()
        //  is actually called by printing "Before get()" and "After get()"
        //  around the call.


        // TODO: 5 - Create a Supplier<LocalDateTime> called 'now' that returns
        //  LocalDateTime.now(). Call get() and print the current date/time.


        // TODO: 6 - Call the generateMultiple method below with your
        //  randomSupplier and print the returned list of 5 random numbers.

    }

    /**
     * Calls the supplier's get() method the specified number of times and
     * collects the results into a list.
     *
     * @param supplier the supplier to call
     * @param count    how many times to call get()
     * @param <T>      the type of supplied values
     * @return a list containing the supplied values
     */
    static <T> List<T> generateMultiple(Supplier<T> supplier, int count) {
        List<T> results = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            results.add(supplier.get());
        }
        return results;
    }
}
