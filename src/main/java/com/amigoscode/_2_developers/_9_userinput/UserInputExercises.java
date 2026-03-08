package com.amigoscode._2_developers._9_userinput;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * User Input Exercises
 *
 * Practice reading and validating user input using java.util.Scanner.
 * Always validate user input — never trust it blindly!
 */
public class UserInputExercises {

    /**
     * Reads a single line of text from the user and returns it.
     *
     * @param scanner the Scanner to read from
     * @return the line entered by the user
     */
    public static String readString(Scanner scanner) {
        // TODO: 1 - Prompt the user with "Enter your name: " (use System.out.print).
        //  Read a full line using scanner.nextLine() and return it.
        return null;
    }

    /**
     * Reads an integer from the user with validation.
     * If the user enters something that is not an integer, catches the exception
     * and returns -1.
     *
     * @param scanner the Scanner to read from
     * @return the integer entered, or -1 if input was invalid
     */
    public static int readIntSafely(Scanner scanner) {
        // TODO: 2 - Prompt the user with "Enter a number: ".
        //  Use a try-catch block:
        //    try to read an int with scanner.nextInt()
        //    catch InputMismatchException, print "Invalid input!", and return -1.
        //  Don't forget to consume the leftover newline with scanner.nextLine()
        //  after reading the int (both in success and failure cases).
        return 0;
    }

    /**
     * Reads strings from the user in a loop until they type "quit".
     * Prints each entered string back to them.
     *
     * @param scanner the Scanner to read from
     */
    public static void readUntilQuit(Scanner scanner) {
        // TODO: 3 - Use a while loop to keep reading input.
        //  Prompt with "Enter text (or 'quit' to stop): ".
        //  Read a line with scanner.nextLine().
        //  If the line equals "quit" (case-insensitive), break out of the loop.
        //  Otherwise, print "You entered: " followed by the input.

    }

    /**
     * Validates that an age is between 0 and 150 (inclusive).
     *
     * @param age the age to validate
     * @return true if valid, false otherwise
     */
    public static boolean isValidAge(int age) {
        // TODO: 4 - Return true if age is between 0 and 150 (inclusive), false otherwise.
        return false;
    }

    /**
     * Validates that an email address contains an "@" symbol.
     *
     * @param email the email to validate
     * @return true if valid (contains @), false otherwise
     */
    public static boolean isValidEmail(String email) {
        // TODO: 5 - Return true if email is not null and contains "@", false otherwise.
        return false;
    }

    /**
     * Runs a simple registration form that collects name, age, and email.
     * Validates each input and keeps asking until valid data is provided.
     *
     * @param scanner the Scanner to read from
     */
    public static void registrationForm(Scanner scanner) {
        // TODO: 6 - Build a registration form:
        //  1. Ask for name (any non-empty string is valid). Keep asking if empty.
        //  2. Ask for age. Keep asking until isValidAge() returns true.
        //     Handle InputMismatchException if they enter a non-number.
        //  3. Ask for email. Keep asking until isValidEmail() returns true.
        //  4. Print a summary: "Registration complete!"
        //     "Name: ...", "Age: ...", "Email: ..."

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Read String ===");
        String name = readString(scanner);
        System.out.println("Hello, " + name + "!");

        System.out.println("\n=== Read Int Safely ===");
        int number = readIntSafely(scanner);
        System.out.println("You entered: " + number);

        System.out.println("\n=== Read Until Quit ===");
        readUntilQuit(scanner);

        System.out.println("\n=== Validation ===");
        System.out.println("Age 25 valid? " + isValidAge(25));
        System.out.println("Age -5 valid? " + isValidAge(-5));
        System.out.println("Email 'test@mail.com' valid? " + isValidEmail("test@mail.com"));
        System.out.println("Email 'invalid' valid? " + isValidEmail("invalid"));

        System.out.println("\n=== Registration Form ===");
        registrationForm(scanner);

        scanner.close();
    }
}
