package com.amigoscode._2_developers._14_nullhandling;

import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Optional Exercises
 *
 * Practice using java.util.Optional to handle potentially absent values.
 * Optional is a container that may or may not contain a non-null value.
 * It helps avoid NullPointerException and makes code intent clearer.
 */
public class OptionalExercises {

    /**
     * Creates an Optional containing the given value.
     * The value MUST NOT be null (Optional.of throws NullPointerException for null).
     *
     * @param value a non-null string
     * @return an Optional containing the value
     */
    public static Optional<String> createOptional(String value) {
        // TODO: 1 - Use Optional.of(value) to create and return an Optional.
        //  Note: Optional.of() will throw NullPointerException if value is null.
        return null;
    }

    /**
     * Creates an Optional that may or may not contain a value.
     * If the input is null, returns an empty Optional.
     *
     * @param value a string that might be null
     * @return an Optional that is empty if value is null, otherwise contains value
     */
    public static Optional<String> createNullableOptional(String value) {
        // TODO: 2 - Use Optional.ofNullable(value) to safely create an Optional.
        //  This returns Optional.empty() if value is null, or Optional.of(value) otherwise.
        return null;
    }

    /**
     * Demonstrates isPresent() and get().
     * Returns the value if present, or "EMPTY" if not.
     *
     * @param optional the Optional to inspect
     * @return the contained value, or "EMPTY"
     */
    public static String checkAndGet(Optional<String> optional) {
        // TODO: 3 - Use optional.isPresent() to check if a value exists.
        //  If present, return optional.get().
        //  If not present, return "EMPTY".
        //  Note: calling get() on an empty Optional throws NoSuchElementException!
        return null;
    }

    /**
     * Returns the value from the Optional, or a default value if empty.
     *
     * @param optional     the Optional to get the value from
     * @param defaultValue the default to use if Optional is empty
     * @return the contained value or the default
     */
    public static String getOrDefault(Optional<String> optional, String defaultValue) {
        // TODO: 4 - Use optional.orElse(defaultValue) to return the value if present,
        //  or defaultValue if the Optional is empty.
        //  This is cleaner than using isPresent() + get().
        return null;
    }

    /**
     * Returns the value from the Optional, or throws an exception if empty.
     *
     * @param optional the Optional to get the value from
     * @return the contained value
     * @throws NoSuchElementException if the Optional is empty
     */
    public static String getOrThrow(Optional<String> optional) {
        // TODO: 5 - Use optional.orElseThrow() to return the value if present,
        //  or throw NoSuchElementException if empty.
        //  You can also use orElseThrow(() -> new RuntimeException("No value!"))
        //  to throw a custom exception.
        return null;
    }

    /**
     * Transforms the value inside the Optional using map().
     * Converts the string to uppercase if present.
     *
     * @param optional the Optional containing a string
     * @return an Optional containing the uppercase string, or empty Optional
     */
    public static Optional<String> transformValue(Optional<String> optional) {
        // TODO: 6 - Use optional.map(String::toUpperCase) to transform the value.
        //  map() applies the function if a value is present, and returns a new Optional.
        //  If the original Optional is empty, map() returns an empty Optional.
        return null;
    }

    /**
     * Demonstrates flatMap() with a method that itself returns an Optional.
     * Extracts the domain from an email address if present.
     *
     * @param emailOptional an Optional that may contain an email address
     * @return an Optional containing the domain (part after @), or empty
     */
    public static Optional<String> extractDomain(Optional<String> emailOptional) {
        // TODO: 7 - Use flatMap() to chain with the getDomain() helper method below.
        //  flatMap() is like map(), but used when the transformation function itself
        //  returns an Optional. It "flattens" Optional<Optional<String>> to Optional<String>.
        //  Call: emailOptional.flatMap(OptionalExercises::getDomain)
        return null;
    }

    /**
     * Helper method: extracts the domain from an email address.
     * Returns empty Optional if the email doesn't contain '@'.
     */
    private static Optional<String> getDomain(String email) {
        int atIndex = email.indexOf('@');
        if (atIndex < 0) {
            return Optional.empty();
        }
        return Optional.of(email.substring(atIndex + 1));
    }

    public static void main(String[] args) {
        System.out.println("=== Optional.of() ===");
        Optional<String> opt1 = createOptional("Hello");
        System.out.println("Created: " + opt1);

        System.out.println("\n=== Optional.ofNullable() ===");
        Optional<String> opt2 = createNullableOptional(null);
        Optional<String> opt3 = createNullableOptional("World");
        System.out.println("From null: " + opt2);
        System.out.println("From 'World': " + opt3);

        System.out.println("\n=== isPresent() and get() ===");
        System.out.println("Check non-empty: " + checkAndGet(opt1));
        System.out.println("Check empty: " + checkAndGet(opt2));

        System.out.println("\n=== orElse() ===");
        System.out.println("Non-empty orElse: " + getOrDefault(opt1, "default"));
        System.out.println("Empty orElse: " + getOrDefault(opt2, "default"));

        System.out.println("\n=== orElseThrow() ===");
        System.out.println("Non-empty orElseThrow: " + getOrThrow(opt1));
        try {
            getOrThrow(opt2);
        } catch (Exception e) {
            System.out.println("Empty orElseThrow threw: " + e.getClass().getSimpleName());
        }

        System.out.println("\n=== map() ===");
        System.out.println("Map 'Hello' to uppercase: " + transformValue(opt1));
        System.out.println("Map empty to uppercase: " + transformValue(opt2));

        System.out.println("\n=== flatMap() ===");
        Optional<String> email = Optional.of("alice@example.com");
        Optional<String> noEmail = Optional.empty();
        Optional<String> badEmail = Optional.of("no-at-sign");
        System.out.println("Domain of alice@example.com: " + extractDomain(email));
        System.out.println("Domain of empty: " + extractDomain(noEmail));
        System.out.println("Domain of 'no-at-sign': " + extractDomain(badEmail));
    }
}
