package com.amigoscode._6_functionalinterfaces._3_extending;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise: Extending Functional Interfaces
 *
 * You can create your own functional interfaces that extend existing ones.
 * A Transformer<T> extends Function<T, T> so that input and output share the
 * same type -- useful for chaining transformations on the same data type.
 *
 * You will also add default methods to your functional interface, which is
 * allowed as long as there is still exactly one abstract method.
 */
public class ExtendingInterfaces {

    // TODO: 1 - Create a @FunctionalInterface called Transformer<T> that
    //  extends Function<T, T>. It inherits the abstract method apply(T t)
    //  from Function, so you do NOT need to declare it again.
    //  Hint:
    //    @FunctionalInterface
    //    interface Transformer<T> extends Function<T, T> { }


    // TODO: 2 - Inside the Transformer interface, add a default method:
    //    default Transformer<T> andThenTransform(Transformer<T> after)
    //  This method should return a new Transformer that first applies 'this',
    //  then applies 'after' to the result.
    //  Hint: return input -> after.apply(this.apply(input));


    public static void main(String[] args) {

        // TODO: 3 - Create a Transformer<String> called 'trimmer' that trims
        //  whitespace from a string using String::trim or s -> s.trim().


        // TODO: 4 - Create a Transformer<String> called 'lowerCaser' that
        //  converts a string to lowercase.


        // TODO: 5 - Chain 'trimmer' and 'lowerCaser' using andThenTransform()
        //  to create a Transformer<String> called 'cleanUp'. Apply it to
        //  "  HELLO WORLD  " and print the result.
        //  Expected: "hello world"


        List<String> messyStrings = Arrays.asList(
                "  Alice  ", "BOB", "  Charlie ", " DIANA  "
        );

        // TODO: 6 - Apply the 'cleanUp' transformer to each element of
        //  messyStrings and collect the results into a new List<String>.
        //  Print the cleaned-up list.
        //  Hint: messyStrings.stream().map(cleanUp).collect(...)

    }
}
