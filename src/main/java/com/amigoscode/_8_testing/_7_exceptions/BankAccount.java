package com.amigoscode._8_testing._7_exceptions;

/**
 * A bank account class with deposit, withdraw, and transfer operations.
 * This class is fully implemented - focus on writing exception tests in BankAccountTest.java.
 */
public class BankAccount {

    private final String accountId;
    private double balance;

    public BankAccount(String accountId, double initialBalance) {
        if (accountId == null || accountId.isBlank()) {
            throw new IllegalArgumentException("Account ID cannot be null or blank");
        }
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.accountId = accountId;
        this.balance = initialBalance;
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * Deposits the given amount into the account.
     * @throws IllegalArgumentException if amount is zero or negative
     */
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive: " + amount);
        }
        balance += amount;
    }

    /**
     * Withdraws the given amount from the account.
     * @throws IllegalArgumentException if amount is zero or negative
     * @throws InsufficientFundsException if balance is less than amount
     */
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive: " + amount);
        }
        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Insufficient funds. Balance: " + balance + ", Requested: " + amount
            );
        }
        balance -= amount;
    }

    /**
     * Transfers the given amount from this account to the target account.
     * @throws IllegalArgumentException if amount is zero or negative
     * @throws InsufficientFundsException if balance is less than amount
     */
    public void transfer(BankAccount target, double amount) {
        if (target == null) {
            throw new IllegalArgumentException("Target account cannot be null");
        }
        this.withdraw(amount);
        target.deposit(amount);
    }
}
