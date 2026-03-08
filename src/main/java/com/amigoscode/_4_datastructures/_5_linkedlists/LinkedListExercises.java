package com.amigoscode._4_datastructures._5_linkedlists;

// Exercise: LinkedList Operations
// Learn how to use LinkedList - a doubly-linked list implementation in Java.

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExercises {

    public static void main(String[] args) {

        // TODO: 1 - Create a LinkedList of Strings called 'list'
        LinkedList<String> list = new LinkedList<>();

        // TODO: 2 - Add elements at the beginning using addFirst(): "First", "Second"
        //           Print the list after each addition to observe the order
        list.addFirst("First");
        System.out.println(list);
        list.addFirst("Second");
        System.out.println(list);

        // TODO: 3 - Add elements at the end using addLast(): "Third", "Fourth"
        //           Print the list
        list.addLast("Third");
        list.addLast("Fourth");
        System.out.println(list);

        // TODO: 4 - Get and print the first element using getFirst()
        //           Get and print the last element using getLast()
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        // TODO: 5 - Remove the first element using removeFirst()
        //           Remove the last element using removeLast()
        //           Print the list after removals
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        // TODO: 6 - Add an element at index 1 using add(index, element): "Inserted"
        //           Print the list to see the element in position
        list.add(1, "Inserted");
        System.out.println(list);

        // TODO: 7 - Iterate using an Iterator and print each element
        //           Use list.iterator() to get the Iterator
        //           Use hasNext() and next() in a while loop
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
