package com.amigoscode._8_testing._7_exceptions;

/**
 * Custom exception thrown when a bank account has insufficient funds for an operation.
 */
public class InsufficientFundsException extends RuntimeException {

    public InsufficientFundsException(String message) {
        super(message);
    }
}
