package com.amigoscode._8_testing._9_mocking;

import java.util.Objects;

/**
 * Represents an order in the system.
 * This class is fully implemented.
 */
public class Order {

    private final String id;
    private final String customerId;
    private final double amount;
    private String status;

    public Order(String id, String customerId, double amount) {
        this.id = id;
        this.customerId = customerId;
        this.amount = amount;
        this.status = "PENDING";
    }

    public String getId() {
        return id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.amount, amount) == 0 &&
                Objects.equals(id, order.id) &&
                Objects.equals(customerId, order.customerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerId, amount);
    }

    @Override
    public String toString() {
        return "Order{id='%s', customerId='%s', amount=%.2f, status='%s'}"
                .formatted(id, customerId, amount, status);
    }
}
