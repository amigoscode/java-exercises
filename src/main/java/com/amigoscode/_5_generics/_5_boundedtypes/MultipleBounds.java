package com.amigoscode._5_generics._5_boundedtypes;

import java.util.Arrays;
import java.util.List;

/**
 * Exercise: Multiple Bounds
 *
 * This exercise demonstrates how a type parameter can have multiple bounds.
 * The syntax is: <T extends ClassBound & InterfaceBound1 & InterfaceBound2>
 * If a class is included, it must come first.
 *
 * Complete the TODOs below.
 */
public class MultipleBounds {

    // TODO: 1 - Create an interface called Printable with a single method:
    //  void print();
    interface Printable {
        void print();
    }

    // TODO: 2 - Create a static generic method:
    //  <T extends Comparable<T> & Printable> T findMin(List<T> list)
    //  It should return the smallest element using compareTo().
    //  If the list is empty, return null.
    //  This method requires T to be both Comparable AND Printable.
    public static <T extends Comparable<T> & Printable> T findMin(List<T> list) {
        if (list.isEmpty()) return null;
        T min = list.get(0);
        for (T element : list) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    // TODO: 3 - Create a static inner class Student that implements both
    //  Comparable<Student> and Printable.
    //  Student should have a "name" (String) and "grade" (double) field,
    //  a constructor, compareTo() based on grade (ascending),
    //  and print() that prints "Student{name='...', grade=...}".
    //  Also override toString() with the same format as print().
    static class Student implements Comparable<Student>, Printable {
        private String name;
        private double grade;

        public Student(String name, double grade) {
            this.name = name;
            this.grade = grade;
        }

        @Override
        public int compareTo(Student other) {
            return Double.compare(this.grade, other.grade);
        }

        @Override
        public void print() {
            System.out.println("Student{name='" + name + "', grade=" + grade + "}");
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', grade=" + grade + "}";
        }
    }

    public static void main(String[] args) {

        // TODO: 4 - Create a List<Student> with at least 3 students having
        //  different grades. Call findMin() to find the student with the
        //  lowest grade. Print the result using the print() method.
        List<Student> students = Arrays.asList(
                new Student("Alice", 85.5),
                new Student("Bob", 72.0),
                new Student("Charlie", 91.3)
        );
        Student lowest = findMin(students);
        lowest.print();

        // TODO: 5 - Add a comment below explaining:
        //  (a) Why must a class bound come before interface bounds?
        //      e.g., <T extends SomeClass & SomeInterface> is valid
        //      but  <T extends SomeInterface & SomeClass> is NOT valid
        //  (b) Can you have multiple class bounds? Why or why not?
        //  (c) How many interface bounds can you have?
        // (a) The class bound must come first because Java syntax requires it; the compiler
        //     uses the first bound as the erasure type, and it must be a class (or the first interface).
        // (b) No, you cannot have multiple class bounds because Java does not support
        //     multiple class inheritance.
        // (c) You can have as many interface bounds as you want (no limit).

    }
}
