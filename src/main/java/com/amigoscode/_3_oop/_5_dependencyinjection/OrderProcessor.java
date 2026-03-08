package com.amigoscode._3_oop._5_dependencyinjection;

/**
 * Exercise: Dependency Injection - Order Processing
 *
 * Build an order processing system where OrderProcessor depends on
 * abstractions (interfaces) rather than concrete classes. The payment
 * gateway and order repository are injected through the constructor.
 *
 * Key concepts:
 * - Multiple dependencies injected via constructor
 * - Separating concerns (payment vs persistence)
 * - Easy to swap implementations (e.g., test doubles)
 * - Clean, testable architecture
 */

// TODO: 1 - Create a PaymentGateway interface with:
//   boolean charge(double amount)
//   Also create a concrete StripeGateway class that implements it.
//   In charge(), print "[Stripe] Charging $<amount>" and return true.


// TODO: 2 - Create an OrderRepository interface with:
//   void save(Order order)
//   Also create a concrete InMemoryOrderRepository class that implements it.
//   In save(), print "[Repository] Order saved: <order>"


// TODO: 3 - Create an Order class with three fields:
//   - id (String)
//   - item (String)
//   - amount (double)
//   Create a constructor, getters, and a toString() method.
//   (You may use a record if you prefer: record Order(String id, String item, double amount) {} )


// TODO: 4 - Create the OrderProcessor class.
//   - Add two private final fields:
//     - paymentGateway (PaymentGateway)
//     - orderRepository (OrderRepository)
//   - Create a constructor that takes both as parameters (constructor injection).


// TODO: 5 - In OrderProcessor, add a method:
//   boolean processOrder(Order order)
//   - First, call paymentGateway.charge(order.getAmount())
//   - If charge returns true, call orderRepository.save(order) and return true
//   - If charge returns false, print "Payment failed for order: <order.getId()>"
//     and return false


class OrderProcessorDemo {
    public static void main(String[] args) {
        // TODO: 6 - Wire everything together:
        //   - Create a StripeGateway
        //   - Create an InMemoryOrderRepository
        //   - Create an OrderProcessor with both dependencies injected
        //   - Create an Order("ORD-001", "Java Course", 29.99)
        //   - Call processOrder() and print the result
        //   - Notice: OrderProcessor has no idea which gateway or
        //     repository it uses. You could swap in a PayPalGateway
        //     or a DatabaseOrderRepository without changing OrderProcessor.

    }
}
