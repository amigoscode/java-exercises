package com.amigoscode._2_developers._10_exceptions;

public class InsufficientFundsException extends Exception {
    private final double amount;

    public InsufficientFundsException(String message, double amount) {
        super(message);
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }
}
