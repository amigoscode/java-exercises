package com.amigoscode._8_testing._9_mocking;

/**
 * Email service interface for sending notifications.
 * In tests, this will be mocked since we don't want to send real emails.
 */
public interface EmailService {

    /**
     * Sends an email.
     *
     * @param to      the recipient email address
     * @param subject the email subject
     * @param body    the email body
     */
    void send(String to, String subject, String body);
}
