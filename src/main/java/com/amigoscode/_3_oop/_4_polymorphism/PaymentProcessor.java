package com.amigoscode._3_oop._4_polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise: Polymorphism - Payment Processing
 *
 * Build a payment processing system using interfaces and polymorphism.
 * Multiple payment methods implement the same interface, allowing
 * the processor to handle any payment type without knowing the details.
 *
 * Key concepts:
 * - Defining interfaces
 * - Multiple classes implementing the same interface
 * - Runtime polymorphism (method dispatch)
 * - Programming to an interface, not an implementation
 * - Default methods in interfaces
 */

// TODO: 1 - Create a Payment interface with:
//   - A method: boolean processPayment(double amount)
//   - A method: String getPaymentMethod()
//   - A default method: void printReceipt(double amount) that prints:
//     "Receipt: $<amount> paid via <getPaymentMethod()>"
//     Default methods provide a body in the interface itself.
interface Payment {
    boolean processPayment(double amount);
    String getPaymentMethod();
    default void printReceipt(double amount) {
        System.out.println("Receipt: $" + amount + " paid via " + getPaymentMethod());
    }
}

// TODO: 2 - Create a CreditCardPayment class that implements Payment.
//   - Add a private field: cardNumber (String)
//   - Create a constructor that takes the cardNumber
//   - Implement processPayment() to print:
//     "Processing credit card payment of $<amount> with card <cardNumber>"
//     and return true
//   - Implement getPaymentMethod() to return "Credit Card"
class CreditCardPayment implements Payment {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount + " with card " + cardNumber);
        return true;
    }

    @Override
    public String getPaymentMethod() {
        return "Credit Card";
    }
}

// TODO: 3 - Create a PayPalPayment class that implements Payment.
//   - Add a private field: email (String)
//   - Create a constructor that takes the email
//   - Implement processPayment() to print:
//     "Processing PayPal payment of $<amount> from <email>"
//     and return true
//   - Implement getPaymentMethod() to return "PayPal"
class PayPalPayment implements Payment {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount + " from " + email);
        return true;
    }

    @Override
    public String getPaymentMethod() {
        return "PayPal";
    }
}

// TODO: 4 - Create a BankTransferPayment class that implements Payment.
//   - Add a private field: bankAccountId (String)
//   - Create a constructor that takes the bankAccountId
//   - Implement processPayment() to print:
//     "Processing bank transfer of $<amount> from account <bankAccountId>"
//     and return true
//   - Implement getPaymentMethod() to return "Bank Transfer"
class BankTransferPayment implements Payment {
    private String bankAccountId;

    public BankTransferPayment(String bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing bank transfer of $" + amount + " from account " + bankAccountId);
        return true;
    }

    @Override
    public String getPaymentMethod() {
        return "Bank Transfer";
    }
}

// TODO: 5 - Create a PaymentProcessor class with a method:
//   void processAllPayments(List<Payment> payments, double amount)
//   Iterate over the list and call processPayment(amount) on each.
//   After each payment, call printReceipt(amount).
class PaymentProcessor {
    void processAllPayments(List<Payment> payments, double amount) {
        for (Payment payment : payments) {
            payment.processPayment(amount);
            payment.printReceipt(amount);
        }
    }
}

class PaymentDemo {
    public static void main(String[] args) {
        // TODO: 6 - Create a List<Payment> containing one of each payment type:
        //   CreditCardPayment, PayPalPayment, BankTransferPayment.
        //   Then create a PaymentProcessor and call processAllPayments().
        List<Payment> payments = new ArrayList<>();
        payments.add(new CreditCardPayment("1234-5678-9012-3456"));
        payments.add(new PayPalPayment("user@email.com"));
        payments.add(new BankTransferPayment("ACC-98765"));

        PaymentProcessor processor = new PaymentProcessor();
        processor.processAllPayments(payments, 100.0);

        // TODO: 7 - Demonstrate runtime polymorphism:
        //   Create a Payment variable and assign different implementations to it.
        //   Call processPayment() each time and observe that the correct
        //   implementation runs based on the actual object type.
        //   Example:
        //     Payment payment = new CreditCardPayment("1234-5678");
        //     payment.processPayment(100.0);
        //     payment = new PayPalPayment("user@email.com");
        //     payment.processPayment(200.0);
        Payment payment = new CreditCardPayment("1234-5678");
        payment.processPayment(100.0);
        payment = new PayPalPayment("user@email.com");
        payment.processPayment(200.0);
        payment = new BankTransferPayment("ACC-11111");
        payment.processPayment(300.0);

    }
}
