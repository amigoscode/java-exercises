package com.amigoscode._2_developers._6_strings;

/**
 * String Methods Exercises
 *
 * Practice the most commonly used String methods in Java. Strings are immutable
 * in Java — every method returns a NEW string rather than modifying the original.
 */
public class StringMethods {

    /**
     * Checks if two strings are equal, first case-sensitive, then case-insensitive.
     * Returns a description of the comparison results.
     *
     * @param a first string
     * @param b second string
     * @return e.g., "equals: false, equalsIgnoreCase: true"
     */
    public static String compareEquality(String a, String b) {
        // TODO: 1 - Use equals() and equalsIgnoreCase() to compare a and b.
        //  Return a string in the format: "equals: <result>, equalsIgnoreCase: <result>"
        return null;
    }

    /**
     * Compares two strings lexicographically using compareTo().
     * Returns "before", "equal", or "after" depending on the result.
     *
     * @param a first string
     * @param b second string
     * @return "before", "equal", or "after"
     */
    public static String compareLexicographic(String a, String b) {
        // TODO: 2 - Use a.compareTo(b) and return:
        //  "before" if result < 0, "equal" if result == 0, "after" if result > 0.
        return null;
    }

    /**
     * Checks if the text contains a keyword and returns both the contains result
     * and the index of the first occurrence.
     *
     * @param text    the text to search in
     * @param keyword the keyword to search for
     * @return e.g., "contains: true, indexOf: 7"
     */
    public static String searchString(String text, String keyword) {
        // TODO: 3 - Use contains() to check if text contains keyword.
        //  Use indexOf() to find the position of keyword in text.
        //  Return "contains: <bool>, indexOf: <index>"
        return null;
    }

    /**
     * Replaces all occurrences of oldWord with newWord, then replaces all digits
     * with "#" using replaceAll with a regex.
     *
     * @param text    the original text
     * @param oldWord the word to replace
     * @param newWord the replacement word
     * @return the modified text with both replacements applied
     */
    public static String replaceDemo(String text, String oldWord, String newWord) {
        // TODO: 4 - First use replace(oldWord, newWord) to swap words.
        //  Then use replaceAll("\\d", "#") to replace all digits with "#".
        //  Return the final result.
        return null;
    }

    /**
     * Splits the text using the given delimiter and returns the parts as a
     * formatted string showing each part on a new line with its index.
     *
     * @param text      the text to split
     * @param delimiter the delimiter to split on
     * @return formatted string showing parts
     */
    public static String splitDemo(String text, String delimiter) {
        // TODO: 5 - Use text.split(delimiter) to get an array of parts.
        //  Build a result string with each part on a new line: "[i] part"
        //  Example: "[0] apple\n[1] banana\n[2] cherry"
        return null;
    }

    /**
     * Checks if the filename starts with a given prefix and ends with a given extension.
     *
     * @param filename  the filename to check
     * @param prefix    the expected prefix
     * @param extension the expected extension (e.g., ".java")
     * @return e.g., "startsWith 'Test': true, endsWith '.java': true"
     */
    public static String checkStartEnd(String filename, String prefix, String extension) {
        // TODO: 6 - Use startsWith(prefix) and endsWith(extension).
        //  Return: "startsWith '<prefix>': <bool>, endsWith '<extension>': <bool>"
        return null;
    }

    /**
     * Extracts a substring from the given text.
     *
     * @param text       the source text
     * @param beginIndex the start index (inclusive)
     * @param endIndex   the end index (exclusive)
     * @return the extracted substring
     */
    public static String substringDemo(String text, int beginIndex, int endIndex) {
        // TODO: 7 - Use text.substring(beginIndex, endIndex) to extract a portion of text.
        //  Return the substring.
        return null;
    }

    /**
     * Formats a receipt line with item name, quantity, and price.
     * Example: "  Apple       x3      $2.50"
     *
     * @param item     the item name
     * @param quantity the quantity
     * @param price    the price per item
     * @return a formatted receipt line
     */
    public static String formatReceipt(String item, int quantity, double price) {
        // TODO: 8 - Use String.format() to create a formatted string.
        //  Format: "%-15s x%-5d $%.2f" (left-align item in 15 chars, quantity in 5, price with 2 decimals)
        return null;
    }

    public static void main(String[] args) {
        System.out.println("=== Equality ===");
        System.out.println(compareEquality("Hello", "hello"));

        System.out.println("\n=== Lexicographic ===");
        System.out.println("apple vs banana: " + compareLexicographic("apple", "banana"));

        System.out.println("\n=== Search ===");
        System.out.println(searchString("Hello World", "World"));

        System.out.println("\n=== Replace ===");
        System.out.println(replaceDemo("I have 3 cats and 2 dogs", "cats", "birds"));

        System.out.println("\n=== Split ===");
        System.out.println(splitDemo("apple,banana,cherry,date", ","));

        System.out.println("\n=== StartsWith / EndsWith ===");
        System.out.println(checkStartEnd("TestRunner.java", "Test", ".java"));

        System.out.println("\n=== Substring ===");
        System.out.println(substringDemo("Hello World", 0, 5));

        System.out.println("\n=== Formatted Receipt ===");
        System.out.println(formatReceipt("Apple", 3, 2.50));
        System.out.println(formatReceipt("Banana", 12, 1.25));
    }
}
