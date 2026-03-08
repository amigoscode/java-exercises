package com.amigoscode._2_developers._2_conditionals;

/**
 * If Statements and Conditional Exercises
 *
 * Practice ternary operators, complex boolean conditions, null-safe operations,
 * proper string comparison, and switch expressions.
 */
public class IfStatements {

    /**
     * Returns "Even" if the number is even, "Odd" otherwise.
     * Must use the ternary operator (not if/else).
     *
     * @param number the number to check
     * @return "Even" or "Odd"
     */
    public static String evenOrOdd(int number) {
        // TODO: 1 - Use the ternary operator ( condition ? valueIfTrue : valueIfFalse )
        //  to return "Even" or "Odd" based on whether number % 2 == 0.
        return null;
    }

    /**
     * Determines if a person is eligible for a loan.
     * Eligible if: (age >= 18 AND income >= 30000) OR (has a guarantor AND age >= 16)
     *
     * @param age          applicant's age
     * @param income       annual income
     * @param hasGuarantor whether the applicant has a guarantor
     * @return true if eligible
     */
    public static boolean isEligibleForLoan(int age, double income, boolean hasGuarantor) {
        // TODO: 2 - Use a single return statement with && and || operators
        //  to express the eligibility condition described above.
        return false;
    }

    /**
     * Returns a letter grade using nested ternary operators.
     * 90-100 -> "A", 80-89 -> "B", 70-79 -> "C", 60-69 -> "D", below 60 -> "F"
     *
     * @param score the score (0-100)
     * @return the letter grade
     */
    public static String getGrade(int score) {
        // TODO: 3 - Use nested ternary operators to return the correct grade.
        //  Example pattern: score >= 90 ? "A" : score >= 80 ? "B" : ...
        return null;
    }

    /**
     * Returns the length of the given string, or -1 if the string is null.
     * Must perform a null check before calling any method on the string.
     *
     * @param text a string that might be null
     * @return the length of the string, or -1 if null
     */
    public static int safeLength(String text) {
        // TODO: 4 - Check if text is null before calling text.length().
        //  Return -1 if text is null, otherwise return text.length().
        return 0;
    }

    /**
     * Checks if two strings are equal, handling nulls safely.
     * Must use .equals() instead of == for string comparison.
     *
     * @param a first string (may be null)
     * @param b second string (may be null)
     * @return true if both strings are equal (or both null)
     */
    public static boolean safeEquals(String a, String b) {
        // TODO: 5 - Compare strings properly:
        //  If both are null, return true.
        //  If only one is null, return false.
        //  Otherwise, use a.equals(b) — never use == for string content comparison.
        return false;
    }

    /**
     * Returns the name of the day of the week for numbers 1 (Monday) through 7 (Sunday).
     * Uses a switch expression with arrow syntax (Java 14+).
     * Returns "Invalid" for any other number.
     *
     * @param day the day number (1-7)
     * @return the name of the day
     */
    public static String getDayName(int day) {
        // TODO: 6 - Use a switch expression with arrow syntax to return the day name.
        //  Example:
        //  return switch (day) {
        //      case 1 -> "Monday";
        //      case 2 -> ...
        //      ...
        //      default -> "Invalid";
        //  };
        return null;
    }

    public static void main(String[] args) {
        System.out.println("=== Ternary Operator ===");
        System.out.println("4 is " + evenOrOdd(4));
        System.out.println("7 is " + evenOrOdd(7));

        System.out.println("\n=== Complex Conditions ===");
        System.out.println("Age 25, Income 40000, No guarantor: " + isEligibleForLoan(25, 40000, false));
        System.out.println("Age 17, Income 10000, Has guarantor: " + isEligibleForLoan(17, 10000, true));
        System.out.println("Age 15, Income 10000, Has guarantor: " + isEligibleForLoan(15, 10000, true));

        System.out.println("\n=== Nested Ternary (Grades) ===");
        System.out.println("Score 95: " + getGrade(95));
        System.out.println("Score 72: " + getGrade(72));
        System.out.println("Score 55: " + getGrade(55));

        System.out.println("\n=== Null Check ===");
        System.out.println("Length of 'hello': " + safeLength("hello"));
        System.out.println("Length of null: " + safeLength(null));

        System.out.println("\n=== String Equality ===");
        System.out.println("'abc' equals 'abc': " + safeEquals("abc", "abc"));
        System.out.println("'abc' equals null: " + safeEquals("abc", null));
        System.out.println("null equals null: " + safeEquals(null, null));

        System.out.println("\n=== Switch Expression ===");
        System.out.println("Day 1: " + getDayName(1));
        System.out.println("Day 5: " + getDayName(5));
        System.out.println("Day 9: " + getDayName(9));
    }
}
