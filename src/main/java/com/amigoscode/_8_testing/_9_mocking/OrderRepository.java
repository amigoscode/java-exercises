package com.amigoscode._8_testing._9_mocking;

import java.util.List;
import java.util.Optional;

/**
 * Repository interface for Order persistence.
 * In tests, this will be mocked since we don't want to use a real database.
 */
public interface OrderRepository {

    /**
     * Saves the given order.
     */
    void save(Order order);

    /**
     * Finds an order by its ID.
     */
    Optional<Order> findById(String id);

    /**
     * Returns all orders.
     */
    List<Order> findAll();

    /**
     * Deletes the order with the given ID.
     */
    void deleteById(String id);
}
