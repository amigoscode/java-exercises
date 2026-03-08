package com.amigoscode._2_developers._3_packages;

// TODO: 1 - Import java.util.List and java.util.ArrayList, then create a List<String>
//  in the useListFromUtil() method below.
import java.util.List;
import java.util.ArrayList;

// TODO: 2 - Import java.time.LocalDate, then use it in the printToday() method below.
import java.time.LocalDate;

import static java.lang.Math.PI;


/**
 * Package and Import Exercises
 *
 * Practice importing classes from java.util and java.time, using fully qualified
 * class names, importing static members, and referencing classes from other packages.
 */
public class PackageDemo {

    /**
     * Creates a List of three fruit names and prints it.
     */
    public static void useListFromUtil() {
        // TODO: 1 (continued) - Create a List<String> using ArrayList, add three fruits,
        //  and print the list. Make sure you have the import statements at the top.
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println(fruits);
    }

    /**
     * Prints today's date using LocalDate.now().
     */
    public static void printToday() {
        // TODO: 2 (continued) - Use LocalDate.now() to get today's date and print it.
        //  Make sure you have the import statement at the top.
        System.out.println(LocalDate.now());
    }

    /**
     * Uses a fully qualified class name to create a HashMap without importing it.
     * Adds two entries and prints the map.
     */
    public static void useFullyQualifiedName() {
        // TODO: 3 - Create a java.util.HashMap<String, Integer> using the fully qualified
        //  class name (no import). Put two entries (e.g., "Alice"->90, "Bob"->85) and print it.
        //  Example: java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        map.put("Alice", 90);
        map.put("Bob", 85);
        System.out.println(map);
    }

    // TODO: 4 - Add a static import for java.lang.Math.PI at the top of this file,
    //  then complete the method below to use PI directly (without Math.PI).

    /**
     * Returns the area of a circle with the given radius.
     * Uses the statically imported PI constant.
     *
     * @param radius the radius of the circle
     * @return the area
     */
    public static double circleArea(double radius) {
        // TODO: 4 (continued) - Return PI * radius * radius using the statically imported PI.
        //  You need to add: import static java.lang.Math.PI; at the top of this file.
        return PI * radius * radius;
    }

    /**
     * Creates an instance of a class from another package in this project
     * and prints it.
     */
    public static void useClassFromAnotherPackage() {
        // TODO: 5 - Import or use a fully qualified name for a class from another package
        //  in this project (e.g., com.amigoscode._2_developers._2_conditionals.IfStatements).
        //  Call one of its static methods and print the result.
        //  Example: String result = com.amigoscode._2_developers._2_conditionals.IfStatements.evenOrOdd(4);
        String result = com.amigoscode._2_developers._2_conditionals.IfStatements.evenOrOdd(4);
        System.out.println("4 is " + result);
    }

    public static void main(String[] args) {
        System.out.println("=== Using java.util.List ===");
        useListFromUtil();

        System.out.println("\n=== Print Today's Date ===");
        printToday();

        System.out.println("\n=== Fully Qualified Class Name ===");
        useFullyQualifiedName();

        System.out.println("\n=== Static Import (PI) ===");
        System.out.println("Area of circle with radius 5: " + circleArea(5));

        System.out.println("\n=== Class From Another Package ===");
        useClassFromAnotherPackage();
    }
}
