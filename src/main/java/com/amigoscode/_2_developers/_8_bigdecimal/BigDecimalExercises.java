package com.amigoscode._2_developers._8_bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * BigDecimal Exercises
 *
 * Practice using BigDecimal for precise decimal arithmetic. BigDecimal avoids
 * the floating-point rounding errors that plague double and float. Essential
 * for financial calculations.
 */
public class BigDecimalExercises {

    /**
     * Creates a BigDecimal from a String representation.
     * IMPORTANT: Always use the String constructor, not the double constructor!
     *
     * @param value the decimal value as a string (e.g., "19.99")
     * @return a BigDecimal representing the value
     */
    public static BigDecimal createFromString(String value) {
        // TODO: 1 - Create and return a BigDecimal using new BigDecimal(value).
        //  The String constructor preserves the exact decimal value.
        //  NEVER use new BigDecimal(0.1) — see TODO 6 for why.
        return null;
    }

    /**
     * Adds two BigDecimal values.
     *
     * @param a first value
     * @param b second value
     * @return the sum
     */
    public static BigDecimal addValues(BigDecimal a, BigDecimal b) {
        // TODO: 2 - Use the add() method to add a and b. Return the result.
        //  Remember: BigDecimal is immutable, so add() returns a NEW BigDecimal.
        return null;
    }

    /**
     * Multiplies two BigDecimal values.
     *
     * @param a first value
     * @param b second value
     * @return the product
     */
    public static BigDecimal multiplyValues(BigDecimal a, BigDecimal b) {
        // TODO: 3 - Use the multiply() method to multiply a and b. Return the result.
        return null;
    }

    /**
     * Divides a by b with the specified scale (decimal places) and HALF_UP rounding.
     *
     * @param a     the dividend
     * @param b     the divisor
     * @param scale the number of decimal places
     * @return the quotient rounded to the specified scale
     */
    public static BigDecimal divideValues(BigDecimal a, BigDecimal b, int scale) {
        // TODO: 4 - Use a.divide(b, scale, RoundingMode.HALF_UP) to divide.
        //  You MUST specify a rounding mode for division, otherwise you may get
        //  an ArithmeticException for non-terminating decimals (like 1/3).
        return null;
    }

    /**
     * Compares two BigDecimal values.
     * IMPORTANT: Use compareTo(), not equals()!
     * BigDecimal.equals() considers scale, so new BigDecimal("2.0").equals(new BigDecimal("2.00"))
     * returns false! compareTo() compares numeric value only.
     *
     * @param a first value
     * @param b second value
     * @return -1 if a < b, 0 if equal, 1 if a > b
     */
    public static int compareValues(BigDecimal a, BigDecimal b) {
        // TODO: 5 - Use a.compareTo(b) to compare the two values.
        //  Return the result (which will be -1, 0, or 1).
        //  Do NOT use equals() for numeric comparison!
        return 0;
    }

    /**
     * Demonstrates why new BigDecimal(double) is problematic.
     * Prints the difference between BigDecimal created from double vs String.
     */
    public static void demonstrateDoubleProblem() {
        // TODO: 6 - Create two BigDecimals for the value 0.1:
        //  BigDecimal fromDouble = new BigDecimal(0.1);
        //  BigDecimal fromString = new BigDecimal("0.1");
        //  Print both values. Notice that fromDouble is NOT exactly 0.1!
        //  It will show something like 0.1000000000000000055511151231257827021181583404541015625
        //  Print a message explaining why the String constructor should be preferred.

    }

    public static void main(String[] args) {
        System.out.println("=== Create from String ===");
        BigDecimal price = createFromString("19.99");
        System.out.println("Price: " + price);

        System.out.println("\n=== Addition ===");
        BigDecimal a = new BigDecimal("10.50");
        BigDecimal b = new BigDecimal("3.75");
        System.out.println("10.50 + 3.75 = " + addValues(a, b));

        System.out.println("\n=== Multiplication ===");
        BigDecimal quantity = new BigDecimal("3");
        System.out.println("19.99 * 3 = " + multiplyValues(price, quantity));

        System.out.println("\n=== Division with Rounding ===");
        BigDecimal ten = new BigDecimal("10");
        BigDecimal three = new BigDecimal("3");
        System.out.println("10 / 3 (2 decimals): " + divideValues(ten, three, 2));
        System.out.println("10 / 3 (5 decimals): " + divideValues(ten, three, 5));

        System.out.println("\n=== Comparison ===");
        BigDecimal val1 = new BigDecimal("2.0");
        BigDecimal val2 = new BigDecimal("2.00");
        System.out.println("2.0 compareTo 2.00: " + compareValues(val1, val2));
        System.out.println("2.0 equals 2.00: " + val1.equals(val2) + " (WRONG way to compare!)");

        System.out.println("\n=== Double Problem ===");
        demonstrateDoubleProblem();
    }
}
