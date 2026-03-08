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
    private T content;

    // TODO: 2 - Create a put(T item) method that stores the item in the box,
    //  and a get() method that returns the stored item.
    public void put(T item) {
        this.content = item;
    }

    public T get() {
        return content;
    }

    // TODO: 3 - Create an isEmpty() method that returns true if the content
    //  is null, and false otherwise.
    public boolean isEmpty() {
        return content == null;
    }

    // TODO: 4 - Override toString() to return "Box{content=" + content + "}".
    //  If the box is empty, it should show "Box{content=null}".
    @Override
    public String toString() {
        return "Box{content=" + content + "}";
    }

    public static void main(String[] args) {

        // TODO: 5 - Create a Box<String>, put "Hello Generics" in it,
        //  print the box, and print whether it is empty.
        Box<String> stringBox = new Box<>();
        stringBox.put("Hello Generics");
        System.out.println(stringBox);
        System.out.println("Is empty: " + stringBox.isEmpty());

        // TODO: 6 - Create a Box<Double>, put 3.14 in it, retrieve the value
        //  using get(), and print it. Then create another Box<Double> without
        //  putting anything in it and verify isEmpty() returns true.
        Box<Double> doubleBox = new Box<>();
        doubleBox.put(3.14);
        System.out.println("Value: " + doubleBox.get());

        Box<Double> emptyBox = new Box<>();
        System.out.println("Empty box is empty: " + emptyBox.isEmpty());

    }
}
