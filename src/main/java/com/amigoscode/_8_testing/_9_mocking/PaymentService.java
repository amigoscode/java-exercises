package com.amigoscode._8_testing._9_mocking;

/**
 * Payment service interface representing an external payment gateway.
 * In tests, this will be mocked since we don't want to make real payment calls.
 */
public interface PaymentService {

    /**
     * Charges the given amount to the customer's account.
     *
     * @param customerId the customer identifier
     * @param amount     the amount to charge
     * @return true if the charge was successful, false otherwise
     */
    boolean charge(String customerId, double amount);

    /**
     * Refunds the given amount to the customer's account.
     *
     * @param customerId the customer identifier
     * @param amount     the amount to refund
     * @return true if the refund was successful, false otherwise
     */
    boolean refund(String customerId, double amount);
}
