package com.amigoscode._5_generics._1_classcastexception;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise: ClassCastException Problem
 *
 * This exercise demonstrates why Java generics were introduced.
 * Before generics, collections used raw types and stored Objects,
 * which led to ClassCastException at runtime.
 *
 * Complete the TODOs below to see the problem firsthand.
 */
public class ClassCastProblem {

    public static void main(String[] args) {

        // TODO: 1 - Create a raw (non-generic) ArrayList without any type parameter.
        //  Hint: List list = new ArrayList();
        List list = new ArrayList();

        // TODO: 2 - Add a String "Hello" and an Integer 42 to the raw list.
        //  This compiles fine because raw lists accept any Object.
        list.add("Hello");
        list.add(42);

        // TODO: 3 - Iterate through the list and try to cast every element to String.
        //  Use a for loop: for (int i = 0; i < list.size(); i++)
        //  Inside the loop, cast list.get(i) to String and print it.
        //  This will compile, but will throw ClassCastException at runtime
        //  when it reaches the Integer element.

        // TODO: 4 - Wrap the casting code from TODO 3 in a try-catch block
        //  that catches ClassCastException. Print the exception message
        //  so you can see what went wrong.
        try {
            for (int i = 0; i < list.size(); i++) {
                String s = (String) list.get(i);
                System.out.println(s);
            }
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }

        // TODO: 5 - Add a comment below explaining:
        //  (a) Why did the ClassCastException occur?
        //  (b) How do generics (e.g., List<String>) prevent this problem?
        //  (c) At what stage (compile-time or runtime) do generics catch type errors?
        // (a) The ClassCastException occurred because we added an Integer (42) to the raw list
        //     and then tried to cast it to String. Integer cannot be cast to String.
        // (b) Generics (e.g., List<String>) prevent this by restricting what types can be added
        //     to the list. The compiler would refuse to add an Integer to a List<String>.
        // (c) Generics catch type errors at compile-time, preventing runtime ClassCastExceptions.

    }
}
