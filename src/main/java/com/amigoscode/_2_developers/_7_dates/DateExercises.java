package com.amigoscode._2_developers._7_dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Date and Time Exercises
 *
 * Practice using the java.time API (introduced in Java 8). These classes are
 * immutable and thread-safe. LocalDate represents a date without time,
 * LocalDateTime represents a date with time.
 */
public class DateExercises {

    /**
     * Returns today's date.
     *
     * @return today's date as a LocalDate
     */
    public static LocalDate getToday() {
        // TODO: 1 - Use LocalDate.now() to get and return today's date.
        return LocalDate.now();
    }

    /**
     * Creates a specific date: July 4, 1776.
     *
     * @return the date July 4, 1776
     */
    public static LocalDate getIndependenceDay() {
        // TODO: 2 - Use LocalDate.of(year, month, day) to create and return July 4, 1776.
        return LocalDate.of(1776, 7, 4);
    }

    /**
     * Returns the current date and time.
     *
     * @return the current date and time as a LocalDateTime
     */
    public static LocalDateTime getCurrentDateTime() {
        // TODO: 3 - Use LocalDateTime.now() to get and return the current date and time.
        return LocalDateTime.now();
    }

    /**
     * Takes a date and adds the specified days, months, and years to it.
     *
     * @param date   the starting date
     * @param days   number of days to add
     * @param months number of months to add
     * @param years  number of years to add
     * @return the new date after adding the specified amounts
     */
    public static LocalDate addToDate(LocalDate date, int days, int months, int years) {
        // TODO: 4 - Use plusDays(), plusMonths(), and plusYears() on the date.
        //  Remember: LocalDate is immutable, so each method returns a NEW LocalDate.
        //  Chain the calls or apply them sequentially.
        return date.plusDays(days).plusMonths(months).plusYears(years);
    }

    /**
     * Checks the relationship between two dates.
     *
     * @param date1 the first date
     * @param date2 the second date
     * @return "before" if date1 is before date2, "after" if after, "equal" if same
     */
    public static String compareDates(LocalDate date1, LocalDate date2) {
        // TODO: 5 - Use isBefore() and isAfter() methods on date1 to compare with date2.
        //  Return "before", "after", or "equal".
        if (date1.isBefore(date2)) return "before";
        if (date1.isAfter(date2)) return "after";
        return "equal";
    }

    /**
     * Formats a date using the given pattern.
     * Example patterns: "dd/MM/yyyy", "MMMM d, yyyy", "yyyy-MM-dd"
     *
     * @param date    the date to format
     * @param pattern the format pattern
     * @return the formatted date as a String
     */
    public static String formatDate(LocalDate date, String pattern) {
        // TODO: 6 - Create a DateTimeFormatter using DateTimeFormatter.ofPattern(pattern).
        //  Use date.format(formatter) to format the date.
        //  Return the formatted string.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }

    /**
     * Parses a date string in the format "dd-MM-yyyy" and returns a LocalDate.
     * Example: "25-12-2025" -> LocalDate of December 25, 2025
     *
     * @param dateString the date string in "dd-MM-yyyy" format
     * @return the parsed LocalDate
     */
    public static LocalDate parseDate(String dateString) {
        // TODO: 7 - Create a DateTimeFormatter with the pattern "dd-MM-yyyy".
        //  Use LocalDate.parse(dateString, formatter) to parse the string.
        //  Return the resulting LocalDate.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(dateString, formatter);
    }

    public static void main(String[] args) {
        System.out.println("=== Today's Date ===");
        System.out.println("Today: " + getToday());

        System.out.println("\n=== Specific Date ===");
        System.out.println("Independence Day: " + getIndependenceDay());

        System.out.println("\n=== Current Date and Time ===");
        System.out.println("Now: " + getCurrentDateTime());

        System.out.println("\n=== Date Arithmetic ===");
        LocalDate today = LocalDate.now();
        System.out.println("Today + 10 days, 2 months, 1 year: " + addToDate(today, 10, 2, 1));

        System.out.println("\n=== Compare Dates ===");
        LocalDate past = LocalDate.of(2020, 1, 1);
        LocalDate future = LocalDate.of(2030, 12, 31);
        System.out.println("2020-01-01 vs 2030-12-31: " + compareDates(past, future));
        System.out.println("2030-12-31 vs 2020-01-01: " + compareDates(future, past));

        System.out.println("\n=== Format Date ===");
        System.out.println("dd/MM/yyyy: " + formatDate(today, "dd/MM/yyyy"));
        System.out.println("MMMM d, yyyy: " + formatDate(today, "MMMM d, yyyy"));

        System.out.println("\n=== Parse Date ===");
        System.out.println("Parsed '25-12-2025': " + parseDate("25-12-2025"));
    }
}
