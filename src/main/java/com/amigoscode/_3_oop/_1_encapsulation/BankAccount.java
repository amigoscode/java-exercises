package com.amigoscode._3_oop._1_encapsulation;

/**
 * Exercise: Encapsulation with BankAccount
 *
 * Learn how to protect data using private fields, provide controlled access
 * through getters, and enforce business rules in methods.
 *
 * Key concepts:
 * - Private fields to hide internal state
 * - Public methods to provide controlled access
 * - Validation logic inside setters/methods
 * - Private helper methods
 */
public class BankAccount {

    // TODO: 1 - Declare three private fields:
    //   - accountNumber (String)
    //   - balance (double)
    //   - ownerName (String)


    // TODO: 2 - Create a constructor that takes accountNumber, ownerName,
    //   and an initialBalance. Validate that initialBalance >= 0,
    //   throwing IllegalArgumentException if not. Assign all fields.


    // TODO: 3 - Create a getter method for balance (getBalance).
    //   Do NOT create a setter for balance — it should only change
    //   through deposit() and withdraw().


    // TODO: 4 - Create a deposit(double amount) method.
    //   - If amount <= 0, throw IllegalArgumentException with message
    //     "Deposit amount must be positive"
    //   - Add amount to balance
    //   - Call the private logTransaction() helper with a descriptive message
    //   - Return the new balance


    // TODO: 5 - Create a withdraw(double amount) method.
    //   - If amount <= 0, throw IllegalArgumentException with message
    //     "Withdrawal amount must be positive"
    //   - If amount > balance, throw IllegalStateException with message
    //     "Insufficient funds"
    //   - Subtract amount from balance
    //   - Call the private logTransaction() helper with a descriptive message
    //   - Return the new balance


    // TODO: 6 - Override toString() to return a string in the format:
    //   "BankAccount{accountNumber='XXX', ownerName='XXX', balance=XXX}"


    // TODO: 7 - Create a private helper method logTransaction(String message)
    //   that prints the message to the console prefixed with
    //   "[Transaction Log] ". This method should NOT be accessible
    //   from outside the class.


    public static void main(String[] args) {
        // Uncomment and test after completing the TODOs:
        // BankAccount account = new BankAccount("ACC-001", "Alice", 1000.0);
        // System.out.println(account);
        // System.out.println("Balance: " + account.getBalance());
        //
        // account.deposit(500.0);
        // System.out.println("After deposit: " + account.getBalance());
        //
        // account.withdraw(200.0);
        // System.out.println("After withdrawal: " + account.getBalance());
        //
        // // These should throw exceptions:
        // // account.deposit(-100);
        // // account.withdraw(999999);
    }
}
