package com.amigoscode._8_testing._9_mocking;

import java.util.List;
import java.util.Optional;

/**
 * Service class that orchestrates order operations using PaymentService and OrderRepository.
 * This class coordinates between the payment gateway and the data store.
 */
public class OrderService {

    private final PaymentService paymentService;
    private final OrderRepository orderRepository;

    public OrderService(PaymentService paymentService, OrderRepository orderRepository) {
        this.paymentService = paymentService;
        this.orderRepository = orderRepository;
    }

    /**
     * Places an order by charging the customer and saving the order.
     * If payment succeeds, order status is set to "COMPLETED" and saved.
     * If payment fails, order status is set to "FAILED" and a RuntimeException is thrown.
     */
    public Order placeOrder(Order order) {
        boolean paymentSuccess = paymentService.charge(
                order.getCustomerId(),
                order.getAmount()
        );

        if (paymentSuccess) {
            order.setStatus("COMPLETED");
            orderRepository.save(order);
            return order;
        } else {
            order.setStatus("FAILED");
            throw new RuntimeException(
                    "Payment failed for order: " + order.getId()
            );
        }
    }

    /**
     * Finds an order by its ID.
     */
    public Optional<Order> findOrder(String id) {
        return orderRepository.findById(id);
    }

    /**
     * Returns all orders.
     */
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    /**
     * Cancels an order by refunding the customer.
     * If refund succeeds, order status is set to "CANCELLED".
     */
    public void cancelOrder(String orderId) {
        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found: " + orderId));

        boolean refundSuccess = paymentService.refund(
                order.getCustomerId(),
                order.getAmount()
        );

        if (refundSuccess) {
            order.setStatus("CANCELLED");
            orderRepository.save(order);
        } else {
            throw new RuntimeException("Refund failed for order: " + orderId);
        }
    }
}
