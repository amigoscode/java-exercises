package com.amigoscode._8_testing._9_mocking;

/**
 * Service that sends notifications about order events using EmailService.
 */
public class NotificationService {

    private final EmailService emailService;

    public NotificationService(EmailService emailService) {
        this.emailService = emailService;
    }

    /**
     * Sends a notification email when an order is placed.
     */
    public void notifyOrderPlaced(Order order) {
        String subject = "Order Confirmation - " + order.getId();
        String body = "Your order #%s for $%.2f has been placed successfully."
                .formatted(order.getId(), order.getAmount());
        emailService.send(order.getCustomerId(), subject, body);
    }

    /**
     * Sends a notification email when an order is cancelled.
     */
    public void notifyOrderCancelled(Order order) {
        String subject = "Order Cancelled - " + order.getId();
        String body = "Your order #%s has been cancelled. A refund of $%.2f will be processed."
                .formatted(order.getId(), order.getAmount());
        emailService.send(order.getCustomerId(), subject, body);
    }
}
