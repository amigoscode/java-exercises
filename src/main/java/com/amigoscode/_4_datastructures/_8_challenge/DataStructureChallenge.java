package com.amigoscode._4_datastructures._8_challenge;

// Exercise: Data Structure Challenge
// Combine multiple data structures to solve a real-world problem.
// Manage a collection of students, group them, track recently viewed, and generate reports.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class DataStructureChallenge {

    // TODO: 1 - Create a Student record (or class) with three fields:
    //           String name, int grade, String subject
    //           If using a record: record Student(String name, int grade, String subject) {}
    //           If using a class: include constructor, getters, and a toString() method
    record Student(String name, int grade, String subject) {}

    public static void main(String[] args) {

        // TODO: 2 - Create a List of 10 students with various names, grades, and subjects
        //           Use at least 3 different subjects (e.g., "Math", "Science", "English")
        //           Example: new Student("Alice", 92, "Math")
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 92, "Math"));
        students.add(new Student("Bob", 85, "Science"));
        students.add(new Student("Charlie", 78, "English"));
        students.add(new Student("Diana", 95, "Math"));
        students.add(new Student("Eve", 88, "Science"));
        students.add(new Student("Frank", 72, "English"));
        students.add(new Student("Grace", 91, "Math"));
        students.add(new Student("Hank", 83, "Science"));
        students.add(new Student("Ivy", 96, "English"));
        students.add(new Student("Jack", 80, "Math"));

        // TODO: 3 - Use a Map<String, List<Student>> to group students by subject
        //           Iterate through the student list
        //           For each student, use computeIfAbsent() to get or create the list for their subject
        //           Then add the student to that list
        //           Print each subject and its students
        Map<String, List<Student>> bySubject = new HashMap<>();
        for (Student s : students) {
            bySubject.computeIfAbsent(s.subject(), k -> new ArrayList<>()).add(s);
        }
        for (Map.Entry<String, List<Student>> entry : bySubject.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // TODO: 4 - Use a Set<String> to find all unique subjects
        //           Iterate through the students and add each subject to the set
        //           Print the unique subjects
        Set<String> subjects = new HashSet<>();
        for (Student s : students) {
            subjects.add(s.subject());
        }
        System.out.println("Unique subjects: " + subjects);

        // TODO: 5 - Use a Stack<Student> to track the last 3 students "viewed"
        //           Push any 3 students from the list onto the stack
        //           Then pop and print them to show the viewing history (most recent first)
        Stack<Student> viewHistory = new Stack<>();
        viewHistory.push(students.get(0));
        viewHistory.push(students.get(3));
        viewHistory.push(students.get(7));
        System.out.println("\nViewing history (most recent first):");
        while (!viewHistory.isEmpty()) {
            System.out.println(viewHistory.pop());
        }

        // TODO: 6 - Sort the student list by grade in descending order using a Comparator
        //           Use list.sort() with Comparator.comparingInt() and .reversed()
        //           Print the sorted list
        students.sort(Comparator.comparingInt(Student::grade).reversed());
        System.out.println("\nSorted by grade (descending):");
        for (Student s : students) {
            System.out.println(s);
        }

        // TODO: 7 - Print a summary report:
        //           - Total number of students
        //           - Number of unique subjects (from the Set)
        //           - Highest grade student (first in sorted list)
        //           - Number of students per subject (from the Map)
        System.out.println("\n--- Summary Report ---");
        System.out.println("Total students: " + students.size());
        System.out.println("Unique subjects: " + subjects.size());
        System.out.println("Highest grade: " + students.get(0));
        for (Map.Entry<String, List<Student>> entry : bySubject.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().size() + " students");
        }

    }
}
