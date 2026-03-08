package com.amigoscode._8_testing._2_assertions;

/**
 * String utility class with various helper methods.
 * This class is fully implemented - focus on writing tests in StringUtilsTest.java.
 */
public class StringUtils {

    /**
     * Checks if a string is a palindrome (reads the same forwards and backwards).
     * @throws IllegalArgumentException if input is null
     */
    public boolean isPalindrome(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    /**
     * Reverses the given string.
     * @throws IllegalArgumentException if input is null
     */
    public String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return new StringBuilder(input).reverse().toString();
    }

    /**
     * Capitalizes the first letter of the given string.
     * @throws IllegalArgumentException if input is null
     */
    public String capitalize(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        if (input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    /**
     * Checks if a string is null or empty.
     */
    public boolean isEmpty(String input) {
        return input == null || input.trim().isEmpty();
    }

    /**
     * Counts the number of vowels (a, e, i, o, u) in the given string.
     * @throws IllegalArgumentException if input is null
     */
    public int countVowels(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        int count = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
