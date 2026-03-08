package com.amigoscode._4_datastructures._4_queues;

// Exercise: Queue Operations
// Learn how to use Queue and PriorityQueue - First In, First Out (FIFO) and priority-based ordering.

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExercises {

    public static void main(String[] args) {

        // --- Basic Queue Operations ---
        System.out.println("--- Basic Queue (LinkedList) ---");

        // TODO: 1 - Create a Queue of Strings using LinkedList as the implementation
        //           Queue<String> queue = ...


        // TODO: 2 - Add 5 elements to the queue using offer(): "Task1", "Task2", "Task3", "Task4", "Task5"


        // TODO: 3 - Peek at the front element without removing it
        //           Print the result (should be "Task1")


        // TODO: 4 - Poll (remove) an element from the front and print it
        //           Then print the queue to see the remaining elements


        // TODO: 5 - Iterate through the queue using a for-each loop and print each element
        //           Note: this does NOT remove elements from the queue


        // --- PriorityQueue ---
        System.out.println("\n--- PriorityQueue ---");

        // TODO: 6 - Create a PriorityQueue of Integers, add these values: 50, 20, 40, 10, 30
        //           Poll all elements one by one and print them
        //           Observe how they come out in natural (ascending) order, not insertion order


        // --- Print Queue Simulation ---
        System.out.println("\n--- Print Queue Simulation ---");

        // TODO: 7 - Simulate a print queue: create a Queue of Strings representing print jobs
        //           Add these jobs using offer(): "Report.pdf", "Photo.jpg", "Letter.docx", "Slides.pptx"
        //           Process (poll) each job one by one, printing "Printing: <job>" for each
        //           Continue until the queue is empty

    }
}
