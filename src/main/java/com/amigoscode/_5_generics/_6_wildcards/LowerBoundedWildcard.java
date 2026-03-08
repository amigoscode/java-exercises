package com.amigoscode._5_generics._6_wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Exercise: Lower Bounded Wildcards (? super T)
 *
 * A lower bounded wildcard <? super Integer> accepts Integer and all its
 * supertypes (Number, Object). This is useful when you want to WRITE to
 * a generic structure.
 *
 * PECS principle: Producer Extends, Consumer Super.
 * When a list CONSUMES values (you write to it), use "super".
 *
 * Complete the TODOs below.
 */
public class LowerBoundedWildcard {

    // TODO: 1 - Create a static method: void addNumbers(List<? super Integer> list)
    //  It should add the integers 1, 2, and 3 to the list.
    //  This works because any list that holds Integer or a supertype of Integer
    //  can safely accept Integer values.
    public static void addNumbers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }

    // TODO: 2 - Create a static method:
    //  <T> void moveElements(List<? extends T> source, List<? super T> destination)
    //  It should read each element from source and add it to destination.
    //  This is the PECS principle in action:
    //    source uses "extends" because it PRODUCES elements (we read from it)
    //    destination uses "super" because it CONSUMES elements (we write to it)
    public static <T> void moveElements(List<? extends T> source, List<? super T> destination) {
        for (T element : source) {
            destination.add(element);
        }
    }

    public static void main(String[] args) {

        // TODO: 3 - Call addNumbers() with three different list types:
        //  (a) List<Integer>   - Integer is Integer (exact match)
        //  (b) List<Number>    - Number is a supertype of Integer
        //  (c) List<Object>    - Object is a supertype of Integer
        //  Print each list after calling addNumbers().
        List<Integer> intList = new ArrayList<>();
        addNumbers(intList);
        System.out.println("List<Integer>: " + intList);

        List<Number> numList = new ArrayList<>();
        addNumbers(numList);
        System.out.println("List<Number>: " + numList);

        List<Object> objList = new ArrayList<>();
        addNumbers(objList);
        System.out.println("List<Object>: " + objList);

        // TODO: 4 - Demonstrate that you CAN add Integer to List<? super Integer>.
        //  Create a List<? super Integer> variable, assign a new ArrayList<Number>()
        //  to it, and add several Integer values. Print the list.
        //  Then try adding a Double and observe/explain the compile error (commented out).
        //
        // list.add(3.14);  // Why doesn't this compile even though list holds Numbers?
        List<? super Integer> list = new ArrayList<Number>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("List<? super Integer>: " + list);
        // list.add(3.14); // Does not compile because the compiler only knows the list accepts
        // Integer (the lower bound), not Double. Even though the underlying list is ArrayList<Number>,
        // the declared type List<? super Integer> only guarantees Integer can be added.

        // TODO: 5 - Use moveElements() to move elements from a List<Integer> source
        //  to a List<Number> destination. Print the destination list to verify.
        List<Integer> source = Arrays.asList(100, 200, 300);
        List<Number> destination = new ArrayList<>();
        moveElements(source, destination);
        System.out.println("Destination: " + destination);

        // TODO: 6 - Add a comment below explaining the PECS principle
        //  (Producer Extends, Consumer Super) as it applies to this exercise.
        //  Why is "super" appropriate when the list is a CONSUMER (we write to it)?
        //  How does this complement the "extends" wildcard?
        // PECS: Producer Extends, Consumer Super.
        // "super" is appropriate when the list consumes (receives) values because we need to
        // guarantee the list can accept values of type T. A List<? super T> can hold T or any
        // supertype, so adding T is always safe. This complements "extends" which is used when
        // reading: "extends" guarantees elements are at least T, "super" guarantees the container
        // can accept T.

    }
}
