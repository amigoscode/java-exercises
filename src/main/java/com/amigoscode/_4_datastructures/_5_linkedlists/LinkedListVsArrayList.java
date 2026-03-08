package com.amigoscode._4_datastructures._5_linkedlists;

// Exercise: LinkedList vs ArrayList Performance Comparison
// Understand when to use LinkedList vs ArrayList by measuring operation times.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListVsArrayList {

    public static void main(String[] args) {

        // TODO: 1 - Create both an ArrayList<Integer> and a LinkedList<Integer>
        //           Fill each with 10000 elements (0 to 9999) using a for loop
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // TODO: 2 - Measure time to add an element at the beginning (index 0) for both lists
        //           Use System.nanoTime() before and after the operation
        //           Perform the add(0, value) operation 1000 times for each list
        //           Print the time taken for each in milliseconds
        //           (divide nanoseconds by 1_000_000 to get milliseconds)
        long start = System.nanoTime();
        for (int i = 0; i < 1000; i++) arrayList.add(0, i);
        long alAddBegin = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) linkedList.add(0, i);
        long llAddBegin = System.nanoTime() - start;

        System.out.println("Add at beginning - ArrayList: " + alAddBegin / 1_000_000 + "ms, LinkedList: " + llAddBegin / 1_000_000 + "ms");

        // TODO: 3 - Measure time to add an element at the end for both lists
        //           Perform the add(value) operation 1000 times for each list
        //           Print the time taken for each
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) arrayList.add(i);
        long alAddEnd = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) linkedList.add(i);
        long llAddEnd = System.nanoTime() - start;

        System.out.println("Add at end - ArrayList: " + alAddEnd / 1_000_000 + "ms, LinkedList: " + llAddEnd / 1_000_000 + "ms");

        // TODO: 4 - Measure time to get an element at the middle index for both lists
        //           Perform get(list.size() / 2) operation 1000 times for each list
        //           Print the time taken for each
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) arrayList.get(arrayList.size() / 2);
        long alGet = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) linkedList.get(linkedList.size() / 2);
        long llGet = System.nanoTime() - start;

        System.out.println("Get middle - ArrayList: " + alGet / 1_000_000 + "ms, LinkedList: " + llGet / 1_000_000 + "ms");

        // TODO: 5 - Print a summary explaining the differences
        //           Use System.out.println() to explain:
        //           - Why LinkedList is faster for insertions at the beginning
        //           - Why ArrayList is faster for random access (get by index)
        //           - When you would choose one over the other
        System.out.println("\nSummary:");
        System.out.println("- LinkedList is faster for insertions at the beginning because it only needs to update pointers.");
        System.out.println("- ArrayList is faster for random access because it uses a contiguous array with O(1) index access.");
        System.out.println("- Use LinkedList when you frequently insert/remove at the beginning. Use ArrayList for random access.");

    }
}
