package com.amigoscode._8_testing._8_tdd;

/**
 * TDD Exercise: Password Validator
 *
 * This class is intentionally EMPTY. Students should:
 * 1. First write tests in PasswordValidatorTest.java (test-first approach)
 * 2. Then implement this class to make the tests pass
 *
 * Password rules to implement:
 * - Must be at least 8 characters long
 * - Must contain at least one uppercase letter
 * - Must contain at least one lowercase letter
 * - Must contain at least one digit
 * - Must contain at least one special character (!@#$%^&*()_+-=)
 * - Null password should throw IllegalArgumentException
 * - Empty password should return false
 */
public class PasswordValidator {

    /**
     * Validates whether the given password meets all strength requirements.
     *
     * @param password the password to validate
     * @return true if the password meets all requirements, false otherwise
     * @throws IllegalArgumentException if password is null
     */
    public boolean isValid(String password) {
        // TODO: Students implement this after writing tests first (TDD approach)
        throw new UnsupportedOperationException("Implement me using TDD!");
    }
}
