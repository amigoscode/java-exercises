package com.amigoscode._6_functionalinterfaces._3_extending;

import java.util.function.Function;

/**
 * Exercise: Combinator Pattern
 *
 * The Combinator Pattern uses functional interfaces to build complex validation
 * logic by combining small, reusable validation functions. Each validator is a
 * function that takes an object and returns a validation result. Validators can
 * be chained using an and() method to create comprehensive validation pipelines.
 *
 * This pattern is powerful because:
 *   - Each validator is a simple, testable unit
 *   - Validators are composable (combine them freely)
 *   - New validators can be added without modifying existing code
 */
public class CombinatorPattern {

    // TODO: 1 - Create a ValidationResult enum with values:
    //  SUCCESS, EMAIL_NOT_VALID, NOT_ADULT, NAME_EMPTY


    // TODO: 2 - Create a Customer record (or class) with three fields:
    //  String name, String email, int age
    //  Hint for record: record Customer(String name, String email, int age) {}


    // TODO: 3 - Create a @FunctionalInterface called CustomerValidator that
    //  extends Function<Customer, ValidationResult>.
    //  Add three static methods that return CustomerValidator:
    //
    //  a) isEmailValid() - returns SUCCESS if email contains "@",
    //     otherwise EMAIL_NOT_VALID
    //
    //  b) isAdult() - returns SUCCESS if age >= 18,
    //     otherwise NOT_ADULT
    //
    //  c) isNameNotEmpty() - returns SUCCESS if name is not null and not blank,
    //     otherwise NAME_EMPTY
    //
    //  Hint:
    //  static CustomerValidator isEmailValid() {
    //      return customer -> customer.email().contains("@")
    //          ? ValidationResult.SUCCESS
    //          : ValidationResult.EMAIL_NOT_VALID;
    //  }


    // TODO: 4 - Inside CustomerValidator, add a default method:
    //    default CustomerValidator and(CustomerValidator other)
    //  This should return a new CustomerValidator that:
    //    - Applies 'this' first. If the result is not SUCCESS, return it.
    //    - Otherwise, apply 'other' and return its result.
    //  Hint:
    //    return customer -> {
    //        ValidationResult result = this.apply(customer);
    //        return result != ValidationResult.SUCCESS ? result : other.apply(customer);
    //    };


    public static void main(String[] args) {

        // TODO: 5 - Chain all three validators using and():
        //  CustomerValidator fullValidator = CustomerValidator.isEmailValid()
        //      .and(CustomerValidator.isAdult())
        //      .and(CustomerValidator.isNameNotEmpty());


        // TODO: 6 - Create a valid customer ("Alice", "alice@example.com", 25)
        //  and validate using fullValidator. Print the result.
        //  Expected: SUCCESS


        // TODO: 7 - Create and validate these invalid customers, printing each result:
        //  a) ("Bob", "bob-no-email", 30)    -> Expected: EMAIL_NOT_VALID
        //  b) ("", "young@email.com", 16)    -> Expected: NOT_ADULT
        //  c) ("", "valid@email.com", 25)    -> Expected: NAME_EMPTY

    }
}
