package com.amigoscode._8_testing._6_parameterized;

/**
 * Email validation utility.
 * This class is fully implemented - focus on writing parameterized tests in EmailValidatorTest.java.
 */
public class EmailValidator {

    /**
     * Validates whether the given string is a valid email address.
     * A valid email must:
     * - Not be null or empty
     * - Contain exactly one '@' symbol
     * - Have at least one character before '@'
     * - Have a domain with at least one '.' after '@'
     * - Not start or end with special characters
     */
    public boolean isValid(String email) {
        if (email == null || email.isBlank()) {
            return false;
        }

        String trimmed = email.trim();

        // Must contain exactly one @
        long atCount = trimmed.chars().filter(c -> c == '@').count();
        if (atCount != 1) {
            return false;
        }

        int atIndex = trimmed.indexOf('@');

        // Must have characters before @
        if (atIndex == 0) {
            return false;
        }

        String domain = trimmed.substring(atIndex + 1);

        // Domain must contain at least one dot
        if (!domain.contains(".")) {
            return false;
        }

        // Domain must not start or end with dot
        if (domain.startsWith(".") || domain.endsWith(".")) {
            return false;
        }

        // Must not have consecutive dots in domain
        if (domain.contains("..")) {
            return false;
        }

        return true;
    }
}
