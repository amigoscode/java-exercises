package com.amigoscode._2_developers._6_strings;

/**
 * StringBuilder Exercises
 *
 * Practice using StringBuilder for efficient string manipulation.
 * Unlike String, StringBuilder is mutable — you can modify it without
 * creating new objects. This is especially important in loops.
 */
public class StringBuilderExercises {

    /**
     * Builds a greeting message by appending parts.
     *
     * @param name the person's name
     * @param age  the person's age
     * @return "Hello, [name]! You are [age] years old."
     */
    public static String buildGreeting(String name, int age) {
        // TODO: 1 - Create a new StringBuilder.
        //  Append "Hello, ", then name, then "! You are ", then age, then " years old."
        //  Convert to String and return.
        return null;
    }

    /**
     * Inserts a middle name into a full name at the correct position.
     * Given "John Smith" and middle name "Michael", returns "John Michael Smith".
     *
     * @param fullName   the full name with first and last name
     * @param middleName the middle name to insert
     * @return the full name with the middle name inserted after the first name
     */
    public static String insertMiddleName(String fullName, String middleName) {
        // TODO: 2 - Create a StringBuilder from fullName.
        //  Find the index of the first space using indexOf(" ").
        //  Insert middleName + " " at position (spaceIndex + 1).
        //  Convert to String and return.
        return null;
    }

    /**
     * Removes all vowels (a, e, i, o, u — both cases) from the text.
     *
     * @param text the original text
     * @return the text with vowels removed
     */
    public static String removeVowels(String text) {
        // TODO: 3 - Create a StringBuilder from text.
        //  Loop through the StringBuilder (backwards is easier for deletion!).
        //  Use deleteCharAt(i) to remove characters that are vowels.
        //  Hint: check if "aeiouAEIOU".indexOf(ch) >= 0
        //  Convert to String and return.
        return null;
    }

    /**
     * Reverses the given text using StringBuilder's reverse() method.
     *
     * @param text the original text
     * @return the reversed text
     */
    public static String reverseText(String text) {
        // TODO: 4 - Create a StringBuilder from text, call reverse(), convert to String.
        return null;
    }

    /**
     * Demonstrates converting between StringBuilder and String.
     * Takes a string, converts to StringBuilder, modifies it, converts back.
     *
     * @param text the original text
     * @return the text converted to uppercase with "!!!" appended
     */
    public static String convertDemo(String text) {
        // TODO: 5 - Convert 'text' to a StringBuilder.
        //  Use toString() to convert the StringBuilder to a String.
        //  Call toUpperCase() on that String (String method, not StringBuilder).
        //  Create a new StringBuilder from the uppercased String, append "!!!"
        //  Return the final String.
        return null;
    }

    /**
     * Converts an array of values into a CSV (comma-separated values) line.
     * Example: ["Alice", "30", "London"] -> "Alice,30,London"
     *
     * @param values the array of values
     * @return a CSV line with values separated by commas (no trailing comma)
     */
    public static String buildCsvLine(String[] values) {
        // TODO: 6 - Create a StringBuilder.
        //  Loop through the values array.
        //  Append each value, and append a comma between values (but NOT after the last one).
        //  Hint: you can check if it's not the last element, or use deleteCharAt at the end.
        //  Return the result as a String.
        return null;
    }

    public static void main(String[] args) {
        System.out.println("=== Build Greeting ===");
        System.out.println(buildGreeting("Alice", 25));

        System.out.println("\n=== Insert Middle Name ===");
        System.out.println(insertMiddleName("John Smith", "Michael"));

        System.out.println("\n=== Remove Vowels ===");
        System.out.println(removeVowels("Hello World"));

        System.out.println("\n=== Reverse ===");
        System.out.println(reverseText("Java"));

        System.out.println("\n=== Convert Demo ===");
        System.out.println(convertDemo("hello world"));

        System.out.println("\n=== Build CSV ===");
        System.out.println(buildCsvLine(new String[]{"Alice", "30", "London", "Engineer"}));
    }
}
