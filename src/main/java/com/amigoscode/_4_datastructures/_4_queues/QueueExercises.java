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
        Queue<String> queue = new LinkedList<>();

        // TODO: 2 - Add 5 elements to the queue using offer(): "Task1", "Task2", "Task3", "Task4", "Task5"
        queue.offer("Task1");
        queue.offer("Task2");
        queue.offer("Task3");
        queue.offer("Task4");
        queue.offer("Task5");

        // TODO: 3 - Peek at the front element without removing it
        //           Print the result (should be "Task1")
        System.out.println("Peek: " + queue.peek());

        // TODO: 4 - Poll (remove) an element from the front and print it
        //           Then print the queue to see the remaining elements
        System.out.println("Polled: " + queue.poll());
        System.out.println("Queue: " + queue);

        // TODO: 5 - Iterate through the queue using a for-each loop and print each element
        //           Note: this does NOT remove elements from the queue
        for (String element : queue) {
            System.out.println(element);
        }

        // --- PriorityQueue ---
        System.out.println("\n--- PriorityQueue ---");

        // TODO: 6 - Create a PriorityQueue of Integers, add these values: 50, 20, 40, 10, 30
        //           Poll all elements one by one and print them
        //           Observe how they come out in natural (ascending) order, not insertion order
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(50); pq.add(20); pq.add(40); pq.add(10); pq.add(30);
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        // --- Print Queue Simulation ---
        System.out.println("\n--- Print Queue Simulation ---");

        // TODO: 7 - Simulate a print queue: create a Queue of Strings representing print jobs
        //           Add these jobs using offer(): "Report.pdf", "Photo.jpg", "Letter.docx", "Slides.pptx"
        //           Process (poll) each job one by one, printing "Printing: <job>" for each
        //           Continue until the queue is empty
        Queue<String> printQueue = new LinkedList<>();
        printQueue.offer("Report.pdf");
        printQueue.offer("Photo.jpg");
        printQueue.offer("Letter.docx");
        printQueue.offer("Slides.pptx");
        while (!printQueue.isEmpty()) {
            System.out.println("Printing: " + printQueue.poll());
        }

    }
}
