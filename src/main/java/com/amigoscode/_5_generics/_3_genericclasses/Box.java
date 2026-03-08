package com.amigoscode._5_generics._3_genericclasses;

/**
 * Exercise: Generic Box Class
 *
 * This exercise has you build a generic Box<T> class that can store
 * a single item of any type. Think of it as a container that can hold
 * exactly one object.
 *
 * Complete the TODOs below.
 */
public class Box<T> {

    // TODO: 1 - Declare a private field of type T called "content".
    //  This field will store the item inside the box.


    // TODO: 2 - Create a put(T item) method that stores the item in the box,
    //  and a get() method that returns the stored item.


    // TODO: 3 - Create an isEmpty() method that returns true if the content
    //  is null, and false otherwise.


    // TODO: 4 - Override toString() to return "Box{content=" + content + "}".
    //  If the box is empty, it should show "Box{content=null}".


    public static void main(String[] args) {

        // TODO: 5 - Create a Box<String>, put "Hello Generics" in it,
        //  print the box, and print whether it is empty.


        // TODO: 6 - Create a Box<Double>, put 3.14 in it, retrieve the value
        //  using get(), and print it. Then create another Box<Double> without
        //  putting anything in it and verify isEmpty() returns true.

    }
}
