package com.amigoscode._8_testing._9_mocking;

import java.time.LocalDateTime;

/**
 * Clock interface for abstracting time access.
 * This allows us to mock the current time in tests.
 */
public interface Clock {

    /**
     * Returns the current date and time.
     */
    LocalDateTime now();
}
