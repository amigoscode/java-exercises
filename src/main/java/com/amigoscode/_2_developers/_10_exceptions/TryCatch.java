package com.amigoscode._2_developers._10_exceptions;

import java.util.Scanner;

/**
 * Try-Catch Exercises
 *
 * Practice exception handling: try-catch, finally, multi-catch, try-with-resources,
 * throwing exceptions, and exception propagation.
 */
public class TryCatch {

    /**
     * Safely accesses an array element at the given index.
     * Returns the element, or -1 if the index is out of bounds.
     *
     * @param arr   the array
     * @param index the index to access
     * @return the element at index, or -1 if out of bounds
     */
    public static int safeArrayAccess(int[] arr, int index) {
        // TODO: 1 - Wrap the array access in a try-catch block.
        //  try to return arr[index].
        //  catch ArrayIndexOutOfBoundsException, print "Index out of bounds: " + index,
        //  and return -1.
        return 0;
    }

    /**
     * Parses a string to an integer safely.
     * Returns the parsed int, or 0 if the string is not a valid number.
     *
     * @param text the string to parse
     * @return the parsed integer, or 0 if invalid
     */
    public static int safeParseInt(String text) {
        // TODO: 2 - Wrap Integer.parseInt(text) in a try-catch block.
        //  catch NumberFormatException, print "Cannot parse: " + text, and return 0.
        return 0;
    }

    /**
     * Demonstrates the finally block. Attempts to divide a by b.
     * The finally block prints "Division operation completed." regardless of success or failure.
     *
     * @param a dividend
     * @param b divisor
     * @return the result of a/b, or 0 if b is zero
     */
    public static int divideWithFinally(int a, int b) {
        // TODO: 3 - Use try-catch-finally:
        //  try: return a / b
        //  catch ArithmeticException: print "Cannot divide by zero!", set result to 0
        //  finally: print "Division operation completed."
        //  Return the result. (You'll need a local variable since return in try
        //  executes after finally.)
        return 0;
    }

    /**
     * Demonstrates catching multiple exception types in a single catch block.
     * Tries to access an array element and parse it as an integer.
     *
     * @param data  array of strings
     * @param index index to access
     * @return the parsed integer, or -1 on any error
     */
    public static int multiCatchDemo(String[] data, int index) {
        // TODO: 4 - Use a try block that:
        //  1. Accesses data[index]
        //  2. Parses the result with Integer.parseInt()
        //  Catch both ArrayIndexOutOfBoundsException and NumberFormatException
        //  in a single catch block using: catch (ExType1 | ExType2 e)
        //  Print "Error: " + e.getMessage() and return -1.
        return 0;
    }

    /**
     * Demonstrates try-with-resources by reading a number from a Scanner.
     * The Scanner is automatically closed when the block exits.
     *
     * @param input the string to create a Scanner from
     * @return the integer read from the input, or -1 on error
     */
    public static int tryWithResourcesDemo(String input) {
        // TODO: 5 - Use try-with-resources to create a Scanner from the input string:
        //  try (Scanner scanner = new Scanner(input)) {
        //      return scanner.nextInt();
        //  }
        //  catch any exception and return -1.
        //  The Scanner will be automatically closed after the try block.
        return 0;
    }

    /**
     * Validates an age value. Throws IllegalArgumentException if age is negative.
     *
     * @param age the age to validate
     * @return the validated age
     * @throws IllegalArgumentException if age is negative
     */
    public static int validateAge(int age) {
        // TODO: 6 - If age < 0, throw a new IllegalArgumentException
        //  with the message "Age cannot be negative: " + age.
        //  Otherwise, return age.
        return age;
    }

    /**
     * Demonstrates exception propagation. Calls a method that might throw,
     * which in turn calls another method that might throw.
     *
     * @param value a string that should contain a positive number
     * @return the validated positive number
     * @throws NumberFormatException     if value is not a number
     * @throws IllegalArgumentException if the number is negative
     */
    public static int processValue(String value) {
        // TODO: 7 - Parse the value to an int using Integer.parseInt(value).
        //  Then call validateAge() with the parsed int.
        //  Do NOT catch any exceptions here — let them propagate to the caller.
        //  This demonstrates that exceptions travel up the call stack.
        return 0;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        System.out.println("=== Safe Array Access ===");
        System.out.println("Index 1: " + safeArrayAccess(numbers, 1));
        System.out.println("Index 5: " + safeArrayAccess(numbers, 5));

        System.out.println("\n=== Safe Parse Int ===");
        System.out.println("Parse '42': " + safeParseInt("42"));
        System.out.println("Parse 'abc': " + safeParseInt("abc"));

        System.out.println("\n=== Finally Block ===");
        System.out.println("10 / 2 = " + divideWithFinally(10, 2));
        System.out.println("10 / 0 = " + divideWithFinally(10, 0));

        System.out.println("\n=== Multi-Catch ===");
        String[] data = {"10", "abc", "30"};
        System.out.println("Index 0: " + multiCatchDemo(data, 0));
        System.out.println("Index 1: " + multiCatchDemo(data, 1));
        System.out.println("Index 9: " + multiCatchDemo(data, 9));

        System.out.println("\n=== Try-With-Resources ===");
        System.out.println("Parse '123': " + tryWithResourcesDemo("123"));
        System.out.println("Parse 'xyz': " + tryWithResourcesDemo("xyz"));

        System.out.println("\n=== Throw Exception ===");
        try {
            validateAge(25);
            System.out.println("Age 25 is valid");
            validateAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        System.out.println("\n=== Exception Propagation ===");
        try {
            System.out.println("Process '42': " + processValue("42"));
            System.out.println("Process '-5': " + processValue("-5"));
        } catch (Exception e) {
            System.out.println("Propagated exception: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}
